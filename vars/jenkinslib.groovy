import org.paspao.sharedlib.JenkinsBuilder

JnkinsBuilder call(def scriptReference, String projectName) {


    return new JenkinsBuilder(scriptReference,projectName,env['BRANCH_NAME'])
}

return this
