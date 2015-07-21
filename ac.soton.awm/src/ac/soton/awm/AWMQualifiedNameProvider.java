/**
 * 
 */
package ac.soton.awm;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import ac.soton.awm.aWM.Instruction;
import ac.soton.awm.aWM.Process;
import ac.soton.awm.aWM.Register;

/**
 * @author vitaly
 *
 */
public class AWMQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider{
 
    QualifiedName qualifiedName(Register reg) {
    	EObject con = reg.eContainer();
    	if (con instanceof Instruction) {
    		Process p = (Process) con.eContainer();
    		return QualifiedName.create(p.getName(), reg.getName());
    	}
        return QualifiedName.create(reg.getName());
    }
 
}
