# DeathInfo

## 配置文件介绍
- **更多类型敬请期待**

|文件名|文件介绍|文件名|文件介绍|
|:-:|-|:-:|-|
|contact.yml|接触（不知道怎么说明）<br>铁砧和仙人掌都会使用内容|default.yml|默认的信息<br>如果没有对应的类型就会使用此内容|
|drowning.yml|溺水|fall.yml|跌落|
|fire.yml|火焰|hunger.yml|饥饿<br>玩家因饥饿而亡就会使用此内容|
|lava.yml|熔岩(岩浆块)|lightning.yml|闪电<br>玩家因被闪电劈亡就会使用此消息|magma.yml||
|magma.yml|岩浆|void.yml|虚空<br>玩家掉入了虚空就会使用此内容|

## **配置方式**
- **模板**
```yml
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
# 变量说明
# %1% = 玩家（死亡的）
# %2% = 击杀者
  - "%1% 带着诸多疑惑就那么离开了这个世界"
  - "%1% 就这么不明不白的被抬走啦&deathinfo.player.isvip"
```