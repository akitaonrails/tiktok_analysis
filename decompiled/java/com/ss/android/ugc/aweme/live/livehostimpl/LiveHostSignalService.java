package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C00EE;
import X.C08CX;
import X.C0CW2;
import X.C0J60;
import X.C0J65;
import X.C0J66;
import X.C0XE1;
import X.C1161920gLG;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2203431BLp;
import X.C481640Iug;
import X.C481660Iui;
import X.C481670Iuj;
import X.C481940IvA;
import X.C482240Ive;
import X.C486270J5d;
import X.C486280J5e;
import X.C486300J5g;
import X.C486320J5i;
import X.C486330J5j;
import X.C486370J5n;
import X.C486380J5o;
import com.bytedance.android.live.dynamicstrategy.IEPIStrategyService;
import com.bytedance.android.livesdk.signal.LiveEpiExpandLifecycleSetting;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkEPIData;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkLiveStatusData;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkRoomCacheUpdateData;
import com.bytedance.android.livesdk.signaling.model.downlink.StarshipDownlinkData;
import com.bytedance.android.livesdk.signaling.model.uplink.UplinkEPIData;
import com.bytedance.android.livesdkapi.host.IHostSignalService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.hangout.component.interact.model.MultiTopLiveRoomMatchScene;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveHostSignalService implements IHostSignalService {
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
    @Override // com.bytedance.android.livesdkapi.host.IHostSignalService
    public final void leaveLive() {
        C481670Iuj c481670Iuj = C481670Iuj.LIZ;
        Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
        Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C486330J5j.class));
        if (obj == null) {
            synchronized (c481670Iuj) {
                try {
                    Object obj2 = ((LinkedHashMap) map).get(C13LE.LIZ(C486330J5j.class));
                    obj = obj2;
                    if (obj2 == null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C486330J5j.class);
                        C0J66<?, ?> c486370J5n = Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class)) ? new C486370J5n() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class)) ? new C0J60() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class)) ? new C486330J5j() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class)) ? new C486320J5i() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class)) ? new C486300J5g() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class)) ? new C481940IvA() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class)) ? new C481660Iui() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class)) ? new C482240Ive() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class)) ? new C481640Iug() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class)) ? new MultiTopLiveRoomMatchScene() : null;
                        map.put(C13LE.LIZ(C486330J5j.class), c486370J5n);
                        obj = c486370J5n;
                        if (c486370J5n != null) {
                            C0J65.LL.LJI(c486370J5n);
                            obj = c486370J5n;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        boolean z = obj instanceof C486330J5j;
        Object obj3 = obj;
        if (!z) {
            obj3 = null;
        }
        C0J66 c0j66 = (C0J66) obj3;
        if (c0j66 != null) {
            C486280J5e c486280J5e = new C486280J5e(null);
            c486280J5e.LIZ = C08CX.INSTANCE;
            c0j66.LJIIJ(c486280J5e);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSignalService
    public final /* bridge */ /* synthetic */ void onInit() {
    }

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
    @Override // com.bytedance.android.livesdkapi.host.IHostSignalService
    public final void enterRoom(String str) {
        C0J66<?, ?> multiTopLiveRoomMatchScene;
        C481670Iuj c481670Iuj = C481670Iuj.LIZ;
        Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
        Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C486330J5j.class));
        if (obj == null) {
            synchronized (c481670Iuj) {
                try {
                    Object obj2 = ((LinkedHashMap) map).get(C13LE.LIZ(C486330J5j.class));
                    obj = obj2;
                    if (obj2 == null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C486330J5j.class);
                        if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class))) {
                            multiTopLiveRoomMatchScene = new C486370J5n();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class))) {
                            multiTopLiveRoomMatchScene = new C0J60();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class))) {
                            multiTopLiveRoomMatchScene = new C486330J5j();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class))) {
                            multiTopLiveRoomMatchScene = new C486320J5i();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class))) {
                            multiTopLiveRoomMatchScene = new C486300J5g();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class))) {
                            multiTopLiveRoomMatchScene = new C481940IvA();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class))) {
                            multiTopLiveRoomMatchScene = new C481660Iui();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class))) {
                            multiTopLiveRoomMatchScene = new C482240Ive();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class))) {
                            multiTopLiveRoomMatchScene = new C481640Iug();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class))) {
                            multiTopLiveRoomMatchScene = new MultiTopLiveRoomMatchScene();
                        } else {
                            multiTopLiveRoomMatchScene = null;
                        }
                        map.put(C13LE.LIZ(C486330J5j.class), multiTopLiveRoomMatchScene);
                        obj = multiTopLiveRoomMatchScene;
                        if (multiTopLiveRoomMatchScene != null) {
                            C0J65.LL.LJI(multiTopLiveRoomMatchScene);
                            obj = multiTopLiveRoomMatchScene;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        boolean z = obj instanceof C486330J5j;
        Object obj3 = obj;
        if (!z) {
            obj3 = null;
        }
        C0J66 c0j66 = (C0J66) obj3;
        if (c0j66 != null) {
            C486280J5e c486280J5e = new C486280J5e(null);
            c486280J5e.LIZ = Collections.singleton(str);
            c0j66.LJIIJ(c486280J5e);
        }
    }

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
    @Override // com.bytedance.android.livesdkapi.host.IHostSignalService
    public final void registerRoomUpdateSignal(C0CW2<DownlinkRoomCacheUpdateData> c0cw2) {
        C0J66<?, ?> multiTopLiveRoomMatchScene;
        C481670Iuj c481670Iuj = C481670Iuj.LIZ;
        Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
        Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C482240Ive.class));
        if (obj == null) {
            synchronized (c481670Iuj) {
                try {
                    Object obj2 = ((LinkedHashMap) map).get(C13LE.LIZ(C482240Ive.class));
                    obj = obj2;
                    if (obj2 == null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C482240Ive.class);
                        if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class))) {
                            multiTopLiveRoomMatchScene = new C486370J5n();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class))) {
                            multiTopLiveRoomMatchScene = new C0J60();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class))) {
                            multiTopLiveRoomMatchScene = new C486330J5j();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class))) {
                            multiTopLiveRoomMatchScene = new C486320J5i();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class))) {
                            multiTopLiveRoomMatchScene = new C486300J5g();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class))) {
                            multiTopLiveRoomMatchScene = new C481940IvA();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class))) {
                            multiTopLiveRoomMatchScene = new C481660Iui();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class))) {
                            multiTopLiveRoomMatchScene = new C482240Ive();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class))) {
                            multiTopLiveRoomMatchScene = new C481640Iug();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class))) {
                            multiTopLiveRoomMatchScene = new MultiTopLiveRoomMatchScene();
                        } else {
                            multiTopLiveRoomMatchScene = null;
                        }
                        map.put(C13LE.LIZ(C482240Ive.class), multiTopLiveRoomMatchScene);
                        obj = multiTopLiveRoomMatchScene;
                        if (multiTopLiveRoomMatchScene != null) {
                            C0J65.LL.LJI(multiTopLiveRoomMatchScene);
                            obj = multiTopLiveRoomMatchScene;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        boolean z = obj instanceof C482240Ive;
        Object obj3 = obj;
        if (!z) {
            obj3 = null;
        }
        C0J66 c0j66 = (C0J66) obj3;
        if (c0j66 != null) {
            c0j66.LIZ(c0cw2, null);
        }
    }

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
    @Override // com.bytedance.android.livesdkapi.host.IHostSignalService
    public final void uplinkRoomCacheUpdateData(C00EE c00ee) {
        C0J66<?, ?> multiTopLiveRoomMatchScene;
        C481670Iuj c481670Iuj = C481670Iuj.LIZ;
        Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
        Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C482240Ive.class));
        Object obj2 = null;
        if (obj == null) {
            synchronized (c481670Iuj) {
                try {
                    Object obj3 = ((LinkedHashMap) map).get(C13LE.LIZ(C482240Ive.class));
                    obj = obj3;
                    if (obj3 == null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C482240Ive.class);
                        if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class))) {
                            multiTopLiveRoomMatchScene = new C486370J5n();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class))) {
                            multiTopLiveRoomMatchScene = new C0J60();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class))) {
                            multiTopLiveRoomMatchScene = new C486330J5j();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class))) {
                            multiTopLiveRoomMatchScene = new C486320J5i();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class))) {
                            multiTopLiveRoomMatchScene = new C486300J5g();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class))) {
                            multiTopLiveRoomMatchScene = new C481940IvA();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class))) {
                            multiTopLiveRoomMatchScene = new C481660Iui();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class))) {
                            multiTopLiveRoomMatchScene = new C482240Ive();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class))) {
                            multiTopLiveRoomMatchScene = new C481640Iug();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class))) {
                            multiTopLiveRoomMatchScene = new MultiTopLiveRoomMatchScene();
                        } else {
                            multiTopLiveRoomMatchScene = null;
                        }
                        map.put(C13LE.LIZ(C482240Ive.class), multiTopLiveRoomMatchScene);
                        obj = multiTopLiveRoomMatchScene;
                        if (multiTopLiveRoomMatchScene != null) {
                            C0J65.LL.LJI(multiTopLiveRoomMatchScene);
                            obj = multiTopLiveRoomMatchScene;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (obj instanceof C482240Ive) {
            obj2 = obj;
        }
        C0J66 c0j66 = (C0J66) obj2;
        if (c0j66 != null) {
            c0j66.LJIIJ(c00ee);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostSignalService
    public final void fillUploadFeatures(Map<String, String> map, String str) {
        ((IEPIStrategyService) C1161920gLG.LIZJ(IEPIStrategyService.class)).fillUploadFeatures(map, str);
    }

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
    @Override // com.bytedance.android.livesdkapi.host.IHostSignalService
    public final void registerEPISignal(String str, C0CW2<DownlinkEPIData> c0cw2) {
        C0J66<?, ?> multiTopLiveRoomMatchScene;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerEPISignal type = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("EPISignal", C2188811AlT.LIZIZ(sbLIZ));
        C481670Iuj c481670Iuj = C481670Iuj.LIZ;
        Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
        Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C486300J5g.class));
        Object obj2 = null;
        if (obj == null) {
            synchronized (c481670Iuj) {
                try {
                    Object obj3 = ((LinkedHashMap) map).get(C13LE.LIZ(C486300J5g.class));
                    obj = obj3;
                    if (obj3 == null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C486300J5g.class);
                        if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class))) {
                            multiTopLiveRoomMatchScene = new C486370J5n();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class))) {
                            multiTopLiveRoomMatchScene = new C0J60();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class))) {
                            multiTopLiveRoomMatchScene = new C486330J5j();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class))) {
                            multiTopLiveRoomMatchScene = new C486320J5i();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class))) {
                            multiTopLiveRoomMatchScene = new C486300J5g();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class))) {
                            multiTopLiveRoomMatchScene = new C481940IvA();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class))) {
                            multiTopLiveRoomMatchScene = new C481660Iui();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class))) {
                            multiTopLiveRoomMatchScene = new C482240Ive();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class))) {
                            multiTopLiveRoomMatchScene = new C481640Iug();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class))) {
                            multiTopLiveRoomMatchScene = new MultiTopLiveRoomMatchScene();
                        } else {
                            multiTopLiveRoomMatchScene = null;
                        }
                        map.put(C13LE.LIZ(C486300J5g.class), multiTopLiveRoomMatchScene);
                        obj = multiTopLiveRoomMatchScene;
                        if (multiTopLiveRoomMatchScene != null) {
                            C0J65.LL.LJI(multiTopLiveRoomMatchScene);
                            obj = multiTopLiveRoomMatchScene;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (obj instanceof C486300J5g) {
            obj2 = obj;
        }
        C0J66 c0j66 = (C0J66) obj2;
        if (c0j66 != null) {
            c0j66.LIZ(c0cw2, Collections.singletonList(str));
        }
    }

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
    @Override // com.bytedance.android.livesdkapi.host.IHostSignalService
    public final void registerLiveStatusSignal(String str, C0CW2<DownlinkLiveStatusData> c0cw2) {
        C0J66<?, ?> multiTopLiveRoomMatchScene;
        C481670Iuj c481670Iuj = C481670Iuj.LIZ;
        Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
        Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C486370J5n.class));
        Object obj2 = null;
        if (obj == null) {
            synchronized (c481670Iuj) {
                try {
                    Object obj3 = ((LinkedHashMap) map).get(C13LE.LIZ(C486370J5n.class));
                    obj = obj3;
                    if (obj3 == null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C486370J5n.class);
                        if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class))) {
                            multiTopLiveRoomMatchScene = new C486370J5n();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class))) {
                            multiTopLiveRoomMatchScene = new C0J60();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class))) {
                            multiTopLiveRoomMatchScene = new C486330J5j();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class))) {
                            multiTopLiveRoomMatchScene = new C486320J5i();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class))) {
                            multiTopLiveRoomMatchScene = new C486300J5g();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class))) {
                            multiTopLiveRoomMatchScene = new C481940IvA();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class))) {
                            multiTopLiveRoomMatchScene = new C481660Iui();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class))) {
                            multiTopLiveRoomMatchScene = new C482240Ive();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class))) {
                            multiTopLiveRoomMatchScene = new C481640Iug();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class))) {
                            multiTopLiveRoomMatchScene = new MultiTopLiveRoomMatchScene();
                        } else {
                            multiTopLiveRoomMatchScene = null;
                        }
                        map.put(C13LE.LIZ(C486370J5n.class), multiTopLiveRoomMatchScene);
                        obj = multiTopLiveRoomMatchScene;
                        if (multiTopLiveRoomMatchScene != null) {
                            C0J65.LL.LJI(multiTopLiveRoomMatchScene);
                            obj = multiTopLiveRoomMatchScene;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (obj instanceof C486370J5n) {
            obj2 = obj;
        }
        C0J66 c0j66 = (C0J66) obj2;
        if (c0j66 != null) {
            c0j66.LIZ(c0cw2, Collections.singletonList(str));
        }
    }

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
    @Override // com.bytedance.android.livesdkapi.host.IHostSignalService
    public final void registerStarshipSignal(String str, C0CW2<StarshipDownlinkData> c0cw2) {
        C0J66<?, ?> multiTopLiveRoomMatchScene;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerStarshipSignal type = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("EPISignal", C2188811AlT.LIZIZ(sbLIZ));
        C481670Iuj c481670Iuj = C481670Iuj.LIZ;
        Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
        Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C481640Iug.class));
        Object obj2 = null;
        if (obj == null) {
            synchronized (c481670Iuj) {
                try {
                    Object obj3 = ((LinkedHashMap) map).get(C13LE.LIZ(C481640Iug.class));
                    obj = obj3;
                    if (obj3 == null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C481640Iug.class);
                        if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class))) {
                            multiTopLiveRoomMatchScene = new C486370J5n();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class))) {
                            multiTopLiveRoomMatchScene = new C0J60();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class))) {
                            multiTopLiveRoomMatchScene = new C486330J5j();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class))) {
                            multiTopLiveRoomMatchScene = new C486320J5i();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class))) {
                            multiTopLiveRoomMatchScene = new C486300J5g();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class))) {
                            multiTopLiveRoomMatchScene = new C481940IvA();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class))) {
                            multiTopLiveRoomMatchScene = new C481660Iui();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class))) {
                            multiTopLiveRoomMatchScene = new C482240Ive();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class))) {
                            multiTopLiveRoomMatchScene = new C481640Iug();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class))) {
                            multiTopLiveRoomMatchScene = new MultiTopLiveRoomMatchScene();
                        } else {
                            multiTopLiveRoomMatchScene = null;
                        }
                        map.put(C13LE.LIZ(C481640Iug.class), multiTopLiveRoomMatchScene);
                        obj = multiTopLiveRoomMatchScene;
                        if (multiTopLiveRoomMatchScene != null) {
                            C0J65.LL.LJI(multiTopLiveRoomMatchScene);
                            obj = multiTopLiveRoomMatchScene;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (obj instanceof C481640Iug) {
            obj2 = obj;
        }
        C0J66 c0j66 = (C0J66) obj2;
        if (c0j66 != null) {
            c0j66.LIZ(c0cw2, Collections.singletonList(str));
        }
    }

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
    @Override // com.bytedance.android.livesdkapi.host.IHostSignalService
    public final void uplinkEPIData(String str, UplinkEPIData uplinkEPIData) {
        C0J66<?, ?> multiTopLiveRoomMatchScene;
        if (LiveEpiExpandLifecycleSetting.INSTANCE.connectWsWhenUplink()) {
            C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
            if (c2203431BLp.getState() == C0XE1.CONNECTION_UNKNOWN) {
                c2203431BLp.LJ("live_epi");
            }
        }
        C481670Iuj c481670Iuj = C481670Iuj.LIZ;
        Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
        Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C486300J5g.class));
        if (obj == null) {
            synchronized (c481670Iuj) {
                try {
                    Object obj2 = ((LinkedHashMap) map).get(C13LE.LIZ(C486300J5g.class));
                    obj = obj2;
                    if (obj2 == null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C486300J5g.class);
                        if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class))) {
                            multiTopLiveRoomMatchScene = new C486370J5n();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class))) {
                            multiTopLiveRoomMatchScene = new C0J60();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class))) {
                            multiTopLiveRoomMatchScene = new C486330J5j();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class))) {
                            multiTopLiveRoomMatchScene = new C486320J5i();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class))) {
                            multiTopLiveRoomMatchScene = new C486300J5g();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class))) {
                            multiTopLiveRoomMatchScene = new C481940IvA();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class))) {
                            multiTopLiveRoomMatchScene = new C481660Iui();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class))) {
                            multiTopLiveRoomMatchScene = new C482240Ive();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class))) {
                            multiTopLiveRoomMatchScene = new C481640Iug();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class))) {
                            multiTopLiveRoomMatchScene = new MultiTopLiveRoomMatchScene();
                        } else {
                            multiTopLiveRoomMatchScene = null;
                        }
                        map.put(C13LE.LIZ(C486300J5g.class), multiTopLiveRoomMatchScene);
                        obj = multiTopLiveRoomMatchScene;
                        if (multiTopLiveRoomMatchScene != null) {
                            C0J65.LL.LJI(multiTopLiveRoomMatchScene);
                            obj = multiTopLiveRoomMatchScene;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        boolean z = obj instanceof C486300J5g;
        Object obj3 = obj;
        if (!z) {
            obj3 = null;
        }
        C0J66 c0j66 = (C0J66) obj3;
        if (c0j66 != null) {
            C486270J5d c486270J5d = new C486270J5d(null, 7);
            c486270J5d.LIZIZ = str;
            c486270J5d.LIZJ = uplinkEPIData.getScene();
            c486270J5d.LIZ = uplinkEPIData.getFeatures();
            c0j66.LJIIJ(c486270J5d);
        }
    }

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
    @Override // com.bytedance.android.livesdkapi.host.IHostSignalService
    public final void uplinkLiveStatusData(String str, Set<String> set) {
        C0J66<?, ?> multiTopLiveRoomMatchScene;
        C481670Iuj c481670Iuj = C481670Iuj.LIZ;
        Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
        Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C486370J5n.class));
        if (obj == null) {
            synchronized (c481670Iuj) {
                try {
                    Object obj2 = ((LinkedHashMap) map).get(C13LE.LIZ(C486370J5n.class));
                    obj = obj2;
                    if (obj2 == null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C486370J5n.class);
                        if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class))) {
                            multiTopLiveRoomMatchScene = new C486370J5n();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class))) {
                            multiTopLiveRoomMatchScene = new C0J60();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class))) {
                            multiTopLiveRoomMatchScene = new C486330J5j();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class))) {
                            multiTopLiveRoomMatchScene = new C486320J5i();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class))) {
                            multiTopLiveRoomMatchScene = new C486300J5g();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class))) {
                            multiTopLiveRoomMatchScene = new C481940IvA();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class))) {
                            multiTopLiveRoomMatchScene = new C481660Iui();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class))) {
                            multiTopLiveRoomMatchScene = new C482240Ive();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class))) {
                            multiTopLiveRoomMatchScene = new C481640Iug();
                        } else if (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class))) {
                            multiTopLiveRoomMatchScene = new MultiTopLiveRoomMatchScene();
                        } else {
                            multiTopLiveRoomMatchScene = null;
                        }
                        map.put(C13LE.LIZ(C486370J5n.class), multiTopLiveRoomMatchScene);
                        obj = multiTopLiveRoomMatchScene;
                        if (multiTopLiveRoomMatchScene != null) {
                            C0J65.LL.LJI(multiTopLiveRoomMatchScene);
                            obj = multiTopLiveRoomMatchScene;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        boolean z = obj instanceof C486370J5n;
        Object obj3 = obj;
        if (!z) {
            obj3 = null;
        }
        C0J66 c0j66 = (C0J66) obj3;
        if (c0j66 != null) {
            c0j66.LJIIJ(new C486380J5o(null, str, set, 51));
        }
    }
}
