# DeathInfo

## **介绍和使用说明**
### **配置文件介绍**
- **更多类型敬请期待**

|文件名|文件介绍|文件名|文件介绍|
|:-:|-|:-:|-|
|contact.yml|接触（不知道怎么说明）<br>铁砧和仙人掌都会使用内容|default.yml|默认的信息<br>如果没有对应的类型就会使用此内容|
|drowning.yml|溺水|fall.yml|跌落|
|fire.yml|火焰|hunger.yml|饥饿<br>玩家因饥饿而亡就会使用此内容|
|lava.yml|熔岩(岩浆块)|lightning.yml|闪电<br>玩家因被闪电劈亡就会使用此消息|magma.yml||
|magma.yml|岩浆|void.yml|虚空<br>玩家掉入了虚空就会使用此内容|

### **配置方式**
- **模板**
```yml
# 符号 & 为分割符号
# 变量说明
# %1% = 玩家（死亡的）
# %2% = 击杀者
message:
- "消息"
- "消息&权限节点"
```
- **示例**
```yml
message:
# 符号 & 为分割符号
# 变量说明
# %1% = 玩家（死亡的）
# %2% = 击杀者
  - "%1% 带着诸多疑惑就那么离开了这个世界"
  - "%1% 就这么不明不白的被抬走啦&deathinfo.player.isvip"
```

### **语言代码可见** 
- 在[cn.nukkit.lang.LangCode](https://github.com/MemoriesOfTime/Nukkit-MOT/blob/master/src/main/java/cn/nukkit/lang/LangCode.java)可查看相关信息

| LangCode | 语言 | 地区 |
|---------|------|------|
| en_US   | English | United States |
| en_GB   | English | United Kingdom |
| de_DE   | Deutsch | Deutschland |
| es_ES   | Español | España |
| es_MX   | Español | México |
| fr_FR   | Français | France |
| fr_CA   | Français | Canada |
| it_IT   | Italiano | Italia |
| ja_JP   | 日本語 | 日本 |
| ko_KR   | 한국어 | 대한민국 |
| pt_BR   | Português | Brasil |
| pt_PT   | Português | Portugal |
| ru_RU   | Русский | Россия |
| zh_CN   | 中文(简体) | 中国 |
| zh_TW   | 中文(繁體) | 中国台湾 |
| nl_NL   | Nederlands | Nederland |
| bg_BG   | Български | България |
| cs_CZ   | Čeština | Česko |
| da_DK   | Dansk | Danmark |
| el_GR   | Ελληνικά | Ελλάδα |
| fi_FI   | Suomi | Suomi |
| hu_HU   | Magyar | Magyarország |
| id_ID   | Indonesia | Indonesia |
| nb_NO   | Norsk bokmål | Norge |
| pl_PL   | Polski | Polska |
| sk_SK   | Slovenčina | Slovensko |
| sv_SE   | Svenska | Sverige |
| tr_TR   | Türkçe | Türkiye |
| uk_UA   | Українська | Україна |