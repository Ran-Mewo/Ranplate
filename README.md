# Ranplate
A template repo for my minecraft mods which is multi-loader & multi-versioned

Current Preprocessor System:
- MC_`<version>`
   - so `MC_1_19` would mean if 1.19 is the current version
- POST_MC_`<version>`
   - so `POST_1_19` would mean if the version is after 1.19
- POST_CURRENT_MC`<version>`
   - so `POST_CURRENT_1_19` would mean if the current version is after 1.19 or is 1.19
- PRE_MC_`<version>`
   - so `PRE_1_19` would mean if the version is before 1.19
- PRE_CURRENT_MC`<version>`
   - so `PRE_CURRENT_1_19` would mean if the current version is before 1.19 or is 1.19

Remember to install the [Manifold](https://plugins.jetbrains.com/plugin/10057-manifold) plugin in IntelliJ!\
Also could look in this [class](https://github.com/Ran-helo/Ranplate/blob/master/common/src/main/java/net/examplemod/ExampleMod.java) if you need an example of how to use it!

This repo contains [MixinExtras](https://github.com/LlamaLad7/MixinExtras) so remember to [check](https://github.com/LlamaLad7/MixinExtras/wiki) that out!\
It also contains a lot of optimization mods to run the development environment a bit better.\
And also contains [Forgix](https://github.com/PacifistMC/Forgix) which basically merges the mod-loaders into one jar!
