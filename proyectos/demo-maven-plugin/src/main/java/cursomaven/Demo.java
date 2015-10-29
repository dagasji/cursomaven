package cursomaven;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "demo") 
public class Demo extends AbstractMojo {

	/**
	 * Url de acceso a bse de datos
	 */
	@Parameter(required=true, property="db.url")
	private String jdbcUrl;

	/*
	 * Codigo del plugin
	 */
	@Parameter (defaultValue="1000", property="codigo")
	private int codigo;

	@Parameter (defaultValue="2015-10-27 5:00:00.0 AM")
	private Date fecha;

	@Parameter 
	private File fichero;

	@Parameter 
	private URL url;

	@Parameter 
	private String[] cadenas;

	@Parameter 
	private List<Integer> enteros;

	@Parameter 
	private Map<String, String> tabla;

	@Parameter 
	private Usuario usuario;

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {

		Log log = getLog();

		log.info("Ejecutando demo Mojo");
		
		log.info(this.toString());


	}

	@Override
	public String toString() {
		return "Demo [jdbcUrl=" + jdbcUrl + ", codigo=" + codigo + ", fecha=" + fecha + ", fichero=" + fichero
				+ ", url=" + url + ", cadenas=" + Arrays.toString(cadenas) + ", enteros=" + enteros + ", tabla=" + tabla
				+ ", usuario=" + usuario + "]";
	}



}
