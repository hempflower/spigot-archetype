# Spigot插件 Maven脚手架
你可以通过此脚手架，快速创建一个Spigot插件。省去了不必要的工作。(懒癌患者的福利)
此仓库包含了5种不同脚手架，适用于不同的场景。具体介绍请看[这里](https://github.com/hempflower/bukkit-plugin-templ)
## 使用方法
### 克隆本仓库
```
git clone https://github.com/hempflower/spigot-archetype.git
```
### 安装脚手架
```
#这里演示安装stand脚手架的步骤，其他脚手架安装方法相同
cd stand
mvn clean install
```
**如果出现`Build Successful`字样，则说明安装成功了**
### 使用脚手架创建项目
```
#随便来到一个目录
mvn archetype:generate
#如果一切正常，最终你会看到如下信息
1: internal -> org.apache.maven.archetypes:maven-archetype-archetype (An archetype which contains a sample archetype.)
2: internal -> org.apache.maven.archetypes:maven-archetype-j2ee-simple (An archetype which contains a simplifed sample J2EE application.)
3: internal -> org.apache.maven.archetypes:maven-archetype-plugin (An archetype which contains a sample Maven plugin.)
4: internal -> org.apache.maven.archetypes:maven-archetype-plugin-site (An archetype which contains a sample Maven plugin site.
      This archetype can be layered upon an existing Maven plugin project.)
5: internal -> org.apache.maven.archetypes:maven-archetype-portlet (An archetype which contains a sample JSR-268 Portlet.)
6: internal -> org.apache.maven.archetypes:maven-archetype-profiles ()
7: internal -> org.apache.maven.archetypes:maven-archetype-quickstart (An archetype which contains a sample Maven project.)
8: internal -> org.apache.maven.archetypes:maven-archetype-site (An archetype which contains a sample Maven site which demonstrates
      some of the supported document types like APT, XDoc, and FML and demonstrates how
      to i18n your site. This archetype can be layered upon an existing Maven project.)
9: internal -> org.apache.maven.archetypes:maven-archetype-site-simple (An archetype which contains a sample Maven site.)
10: internal -> org.apache.maven.archetypes:maven-archetype-webapp (An archetype which contains a sample Maven Webapp project.)
11: local -> cn.orecraft:spigot-basic (basic-archetype)
12: local -> cn.orecraft:spigot-command (spigot-command)
13: local -> cn.orecraft:spigot-event-archetype (spigot-event-archetype)
14: local -> cn.orecraft:spigot-ormlite (spigot-ormlite)
15: local -> cn.orecraft:spigot-stand (spigot-stand)
Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): 7:
#最后几项(如cn.orecraft:spigot-basic)便是spigot脚手架，输入开头的序号(如11)并敲回车就会进入下一步

Define value for property 'groupId': cn.orecraft.plugin #groupId,不懂的话填你的包名
Define value for property 'artifactId': Example #artifactId,填写你的插件名称即可。建议首字母大写
Define value for property 'version' 1.0-SNAPSHOT: : #你的插件版本号
Define value for property 'package' cn.orecraft.plugin: : #你的包名，默认使用groupId
Confirm properties configuration:
groupId: cn.orecraft.plugin
artifactId: Example
version: 1.0-SNAPSHOT
package: cn.orecraft.plugin
 Y: : #没问题的话回车

```
如果一切正常，maven将会在当前目录下新建一个目录。目录名是你的artifactId。目录中包含的就是通过脚手架创建的插件。接下来就愉快的开始开发吧！

如果你觉得这个脚手架很好用，不妨给个Star,或者为我们提供更好的建议。当然你也可以在[爱发电](https://afdian.net/@hempflower)为作者打赏~~(竟有如此厚颜无耻之人)~~。
