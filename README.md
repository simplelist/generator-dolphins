# generator-dolphins (海豚🐬)

Yeoman 工程脚手架，可以生成基础SpringBoot项目，CRUD 代码。本项目使用 NodeJS 开发，使用时务必安装 [NodeJS](https://nodejs.org)

## Yeoman http://yeoman.io

THE WEB'S SCAFFOLDING TOOL FOR MODERN WEBAPPS

Get started and then find a generator for your webapp. Generators are available for Angular, Backbone, React, Polymer and over 5600+ other projects.

One-line install using npm: `npm install -g yo`

## Usage

使用之前先检查各依赖是否安装完整

```
$ node -v && npm -v && yo --version
v8.9.1
5.5.1
2.0.0
```

开始

```
$ git clone https://github.com/simplelist/generator-dolphins.git && cd ggenerator-dolphins

$ npm link
```

### Mirco Service

生成基础微服务项目

```
$ mkdir mirco-service && cd mirco-service
$ yo dolphins
```

### Entity

只需要在数据库创建好表结构，即可生成一整套的增删改查代码

`MySQL URL Format: mysql://user:pass@host/db?charset=utf8`

```
$ cd $PROJECT_HOME
$ yo dolphins:entity
```

## Upgrade

```
$ cd generator-dolphins
$ git pull
```


