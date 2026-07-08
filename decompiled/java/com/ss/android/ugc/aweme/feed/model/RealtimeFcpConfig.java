package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C13LP;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class RealtimeFcpConfig implements Serializable {

    @C09CT("realtime_component_config")
    public RealtimeComponentConfig realtimeComponentConfig;

    public RealtimeFcpConfig() {
        this(null);
    }

    public final RealtimeFcpConfig copy(RealtimeComponentConfig realtimeComponentConfig) {
        return new RealtimeFcpConfig(realtimeComponentConfig);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final RealtimeFcpConfig deepCopy() {
        RealtimeComponentConfig realtimeComponentConfig = this.realtimeComponentConfig;
        RealtimeComponentConfig realtimeComponentConfigCopy = null;
        if (realtimeComponentConfig != null) {
            List<String> list = realtimeComponentConfig.rerankedComponents;
            realtimeComponentConfigCopy = realtimeComponentConfig.copy(realtimeComponentConfig.globalShowLimit, realtimeComponentConfig.disableComponents, list != null ? C13LP.LLIIII(list) : null, realtimeComponentConfig.componentDataList, realtimeComponentConfig.finalFilterComponents, realtimeComponentConfig.serverTrackExtra, realtimeComponentConfig.componentPreloadConfig, realtimeComponentConfig.slotStrategy);
        }
        return copy(realtimeComponentConfigCopy);
    }

    public RealtimeFcpConfig(RealtimeComponentConfig realtimeComponentConfig) {
        this.realtimeComponentConfig = realtimeComponentConfig;
    }
}
