package beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "testView")
@ViewScoped
public class TestView implements Serializable {
	private String testString;

	public void inicializar() {
		System.out.println("initializing: " + testString);

	}

	public void inserirNaLista() {
		System.out.println(testString);
	}

	public String getTestString() {
		return testString;
	}

	public void setTestString(String testString) {
		this.testString = testString;
	}

}

