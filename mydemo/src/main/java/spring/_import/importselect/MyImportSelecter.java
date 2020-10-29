package spring._import.importselect;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @description:
 * @author: lsj
 * @create: 2019-10-12 21:42
 **/
public class MyImportSelecter implements ImportSelector {
	/**
	 * @param importingClassMetadata 当前标注@Import注解的类的所有注解信息
	 */
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"spring._import.compent.Car"};
	}
}
