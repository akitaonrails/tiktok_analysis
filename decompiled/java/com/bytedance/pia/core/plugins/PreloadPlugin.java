package com.bytedance.pia.core.plugins;

import X.C1BO6;
import X.C1BPP;
import X.C2204041BNy;
import X.InterfaceC1530160pvC;
import X.InterfaceC1530550pvp;
import X.InterfaceC1542530qF9;
import X.InterfaceC2203861BNg;
import com.bytedance.pia.core.plugins.PreloadPlugin;
import com.bytedance.pia.core.tracing.EventName;
import com.bytedance.pia.core.tracing.Tracing;
import com.bytedance.pia.core.tracing.Tracing.Event;
import com.bytedance.pia.core.utils.GsonUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public class PreloadPlugin extends C1BO6 {
    public final InterfaceC2203861BNg LIZJ;

    @Override // X.C1BO6
    public final String LIZ() {
        return "preload";
    }

    @Override // X.C1BO6, X.InterfaceC1542530qF9
    public final void release() {
        InterfaceC2203861BNg interfaceC2203861BNg = this.LIZJ;
        if (interfaceC2203861BNg instanceof InterfaceC1542530qF9) {
            ((InterfaceC1542530qF9) interfaceC2203861BNg).release();
        }
    }

    public PreloadPlugin(C2204041BNy c2204041BNy) {
        InterfaceC2203861BNg interfaceC2203861BNg;
        super(c2204041BNy);
        Object obj = c2204041BNy.LJIIJJI;
        this.LIZJ = (!(obj instanceof InterfaceC1530160pvC) || (interfaceC2203861BNg = (InterfaceC2203861BNg) ((InterfaceC1530160pvC) obj).LIZIZ(InterfaceC2203861BNg.class)) == null) ? InterfaceC2203861BNg.LIZ : interfaceC2203861BNg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.1BNf] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.C1BO6
    public final void LJ(String str, Object... objArr) {
        if ("event-on-manifest-ready".equals(str)) {
            Object obj = objArr[0];
            if (obj instanceof n) {
                k kVarLJJIIZ = ((n) obj).LJJIIZ("resources");
                if (!(kVarLJJIIZ instanceof n)) {
                    return;
                }
                try {
                    Map map = (Map) GsonUtils.LIZ().LIZJ(kVarLJJIIZ, Map.class);
                    if (map != null) {
                        this.LIZJ.LIZIZ(new InterfaceC1530550pvp() { // from class: X.1BNf
                            @Override // X.InterfaceC1530550pvp
                            public final void accept(Object obj2) {
                                PreloadPlugin preloadPlugin = this.LIZ;
                                C1530560pvq c1530560pvq = (C1530560pvq) obj2;
                                Tracing tracing = preloadPlugin.LIZIZ.LJIILL;
                                EventName eventName = EventName.PreloadResourceStart;
                                long j = c1530560pvq.LIZIZ;
                                tracing.getClass();
                                Tracing.Event event = tracing.new Event(eventName, j);
                                event.args.put("url", c1530560pvq.LIZ);
                                event.LIZ();
                                Tracing tracing2 = preloadPlugin.LIZIZ.LJIILL;
                                EventName eventName2 = EventName.PreloadResourceEnd;
                                long j2 = c1530560pvq.LIZJ;
                                tracing2.getClass();
                                Tracing.Event event2 = tracing2.new Event(eventName2, j2);
                                event2.args.put("url", c1530560pvq.LIZ);
                                event2.LIZ();
                            }
                        });
                        InterfaceC2203861BNg interfaceC2203861BNg = this.LIZJ;
                        this.LIZIZ.LJ.toString();
                        interfaceC2203861BNg.LIZ(map);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1BPP.LIZJ(4, "[Preload] parse preload config error", th);
                }
            }
        }
    }
}
