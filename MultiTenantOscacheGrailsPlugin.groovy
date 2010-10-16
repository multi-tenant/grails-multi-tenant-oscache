class MultiTenantOscacheGrailsPlugin
{
  // the plugin version
  def version = "1.0.0-SNAPSHOT"
  // the version or versions of Grails the plugin is designed for
  def grailsVersion = "1.3.1 > *"
  // the other plugins this plugin depends on
  def dependsOn = [multiTenantCore: "1.0.0-SNAPSHOT"]
  // resources that are excluded from plugin packaging
  def pluginExcludes = [
          "grails-app/views/error.gsp"
  ]
  def author = "Scott Ryan"
  def authorEmail = "scryan@codehaus.org"
  def title = "OS Cache for Multi-Tenant Plugin"
  def description = '''\\
Provides OS Cache support for 2nd level caching with the multi-tenant plugin running in one database per tenant mode.
'''

  // URL to the plugin's documentation
  def documentation = "http://grails.org/plugin/multi-tenant-oscache"

  def doWithWebDescriptor = { xml ->
  }

  def doWithSpring = {
  }

  def doWithDynamicMethods = { ctx ->
  }

  def doWithApplicationContext = { applicationContext ->
  }

  def onChange = { event ->
    // watching is modified and reloaded. The event contains: event.source,
    // event.application, event.manager, event.ctx, and event.plugin.
  }

  def onConfigChange = { event ->
    // The event is the same as for 'onChange'.
  }
}
