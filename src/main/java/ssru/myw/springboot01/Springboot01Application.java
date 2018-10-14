package ssru.myw.springboot01;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

@SpringBootApplication
@MapperScan("ssru.myw.*")// 扫描该包下相应的class，主要是mybatis的持久化类
public class Springboot01Application {
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverter() {
        // 需要先定义一个convert 转消息的对象
        FastJsonHttpMessageConverter fastConverter =
                new FastJsonHttpMessageConverter();
        // 定义FastJsonConfig 添加fastjson的配置信息，比如：是否要返回格式化的json数据
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        fastConverter.setFastJsonConfig(fastJsonConfig);
        HttpMessageConverter<?> converter = fastConverter;
        return new HttpMessageConverters(converter);
    }

    public static void main(String[] args) {
        SpringApplication.run(Springboot01Application.class, args);
    }

}
