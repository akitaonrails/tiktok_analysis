package com.ss.android.ugc.aweme.shortvideo.edit;

import X.C0W10;
import X.C11HO;
import X.C11HP;
import X.C13LP;
import X.C15O7;
import X.C1662160tM6;
import X.C19883712qx;
import X.C201955140j;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2216301Boi;
import X.C2216321Bok;
import X.C2216331Bol;
import X.C2216341Bom;
import X.C2216351Bon;
import X.C2216391Bor;
import X.C2216411Bot;
import X.C2216431Bov;
import X.C2216441Bow;
import X.C2216461Boy;
import X.C259800zU;
import X.C280040AyI;
import X.C297290Bl1;
import X.C786410Ut5;
import X.C816420W0y;
import X.C823050WQl;
import X.InterfaceC1456930o15;
import X.InterfaceC21368818ju;
import X.InterfaceC2216361Boo;
import X.InterfaceC2216371Bop;
import X.InterfaceC2216381Boq;
import X.InterfaceC2216401Bos;
import X.InterfaceC2216711BpN;
import Y.AObjectS408S0100000_34;
import Y.AObserverS236S0100000_34;
import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.creationmodel.framework.ScopeKey;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModelReadWriter;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS400S0200000_34;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class EditPageCreationModelInitializeKotlin {
    public static final EditPageCreationModelInitializeKotlin LIZ = new EditPageCreationModelInitializeKotlin();

    public static void LIZIZ(CreativeModel creativeModel, VideoPublishEditModel videoPublishEditModel) {
        C201955140j.LJIILJJIL(C1662160tM6.LIZIZ, "CreationModelManager refreshCreativeModel");
        CreativeModel creativeModel2 = videoPublishEditModel.creativeModel;
        if (creativeModel2 != creativeModel) {
            creativeModel.prePublishStatusModel = creativeModel2.prePublishStatusModel;
            creativeModel.quickPostOnEditPageModel = creativeModel2.quickPostOnEditPageModel;
            creativeModel.shortcutPublishStatusModel = creativeModel2.shortcutPublishStatusModel;
            creativeModel.toUploadAlbum = creativeModel2.toUploadAlbum;
            creativeModel.videoDetectionRiskInfo = creativeModel2.videoDetectionRiskInfo;
            creativeModel.commentForwardModel = creativeModel2.commentForwardModel;
            videoPublishEditModel.creativeModel = creativeModel;
            videoPublishEditModel.refreshOldFieldIfNeeded();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v67, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v23, types: [X.0peW] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static C2216441Bow LIZ(Scene scene, VideoPublishEditModel videoPublishEditModel, Bundle bundle) {
        C2216441Bow c2216441BowLIZ;
        Object key;
        C2216431Bov c2216431BovLIZIZ;
        ScopeKey scopeKey;
        Activity activityRequireActivity = scene.requireActivity();
        if (!C2216351Bon.LIZ) {
            C2216411Bot.LIZIZ(CreativeModel.class, CreativeModelReadWriter.class);
            C2216321Bok c2216321Bok = C2216321Bok.LIZ;
            Object obj = new Object() { // from class: X.0wOp
            };
            c2216321Bok.getClass();
            ((HashMap) C2216321Bok.LJ).put(CreativeModel.class, obj);
            C786410Ut5.N3(activityRequireActivity);
            C2216321Bok.LIZJ.add(new C816420W0y(new C0W10() { // from class: X.0peW
                public final C01GW LIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(126));
                public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(127));

                public final Keva LJ() {
                    return (Keva) this.LIZIZ.getValue();
                }

                @Override // X.C0W10
                public final void clearPreviousDiskBundle() {
                    for (Map.Entry<String, ?> entry : LJ().getAll().entrySet()) {
                        String key2 = entry.getKey();
                        if (TimeUnit.MILLISECONDS.toDays(SystemClock.uptimeMillis() - ((Long) entry.getValue()).longValue()) > 2) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("CreationModel clear disk uuid: ");
                            sbLIZ.append(key2);
                            sbLIZ.append(" by time");
                            C2188811AlT.LIZIZ(sbLIZ);
                            ((Keva) this.LIZ.getValue()).erase(key2);
                            LJ().erase(key2);
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("CreationModel skip clear disk uuid: ");
                            sbLIZ2.append(key2);
                            sbLIZ2.append(" by time because time is not enough");
                            C2188811AlT.LIZIZ(sbLIZ2);
                        }
                    }
                }

                @Override // X.C0W10
                public final byte[] LIZJ(String str) {
                    byte[] bytesJustDisk = ((Keva) this.LIZ.getValue()).getBytesJustDisk(str, new byte[0]);
                    if (bytesJustDisk.length != 0) {
                        LJ().storeLong(str, SystemClock.uptimeMillis());
                    }
                    return bytesJustDisk;
                }

                @Override // X.C0W10
                public final boolean LIZLLL(String str) {
                    boolean z = ((Keva) this.LIZ.getValue()).getBoolean(str, false);
                    LJ().storeLong(str, SystemClock.uptimeMillis());
                    return z;
                }

                @Override // X.C0W10
                public final void LIZ(String str, boolean z) {
                    ((Keva) this.LIZ.getValue()).storeBoolean(str, z);
                    LJ().storeLong(str, SystemClock.uptimeMillis());
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("CreationModel save bundle uuid: ");
                    sbLIZ.append(str);
                    sbLIZ.append(" recycle policy timestamp");
                    C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.C0W10
                public final void LIZIZ(String str, byte[] bArr) {
                    ((Keva) this.LIZ.getValue()).storeBytesJustDisk(str, bArr);
                    LJ().storeLong(str, SystemClock.uptimeMillis());
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("CreationModel save bundle uuid: ");
                    sbLIZ.append(str);
                    sbLIZ.append(" recycle policy timestamp");
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }, C823050WQl.LIZLLL(), AFwS200S0000000_13.get$arr$(210)));
            for (Map.Entry entry : C2097608Jq.LJIIIIZZ(new Pair("RecordScope", InterfaceC2216381Boq.class), new Pair("EditScope", InterfaceC1456930o15.class), new Pair("NowEditScope", InterfaceC2216361Boo.class), new Pair("PublishScope", InterfaceC2216371Bop.class)).entrySet()) {
                C19883712qx<String, Class<?>> c19883712qx = C2216321Bok.LIZLLL;
                Object key2 = entry.getKey();
                Object value = entry.getValue();
                if (!c19883712qx.LIZ.containsKey(key2)) {
                    if (!c19883712qx.LIZIZ.containsKey(value)) {
                        c19883712qx.LIZ.put((K) key2, (V) value);
                        c19883712qx.LIZIZ.put((V) value, (K) key2);
                    } else {
                        throw new IllegalArgumentException("Duplicate value");
                    }
                } else {
                    throw new IllegalArgumentException("Duplicate key");
                }
            }
            C2216351Bon.LIZ = true;
        }
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = videoPublishEditModel.getCreationId();
        if (bundle != null && C297290Bl1.LIZ() && (scopeKey = (ScopeKey) bundle.getParcelable("CreationScopeKey")) != null && (c2216441BowLIZ = C2216321Bok.LIZ.LIZ(scopeKey)) != null) {
            CreativeModel creativeModel = (CreativeModel) c2216441BowLIZ.LIZ(CreativeModel.class);
            VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) c2216441BowLIZ.LIZ(VideoPublishEditModel.class);
            if (creativeModel != null) {
                if (videoPublishEditModel2 != null) {
                    videoPublishEditModel2.creativeModel = creativeModel;
                    videoPublishEditModel2.refreshOldFieldIfNeeded();
                    videoPublishEditModel2.setRestoreFromSaveInstance(true);
                    videoPublishEditModel2.setWorkspace((Workspace) bundle.getParcelable("workspace"));
                    c259800zU.element = videoPublishEditModel2.getCreationId();
                } else {
                    throw new IllegalArgumentException("editModel is null");
                }
            } else {
                throw new IllegalArgumentException("creativeModel is null");
            }
        } else {
            CreativeModel creativeModel2 = videoPublishEditModel.creativeModel;
            C2216321Bok c2216321Bok2 = C2216321Bok.LIZ;
            String str = (String) c259800zU.element;
            AwS400S0200000_34 awS400S0200000_34 = new AwS400S0200000_34(creativeModel2, videoPublishEditModel, 8);
            c2216321Bok2.getClass();
            List listLLIIII = C13LP.LLIIII(C2216321Bok.LIZJ);
            Map mapLJIIZILJ = C2097608Jq.LJIIZILJ(C2216321Bok.LJ);
            C19883712qx<String, Class<?>> c19883712qx2 = C2216321Bok.LIZLLL;
            C2216301Boi c2216301Boi = new C2216301Boi(c2216321Bok2);
            C2216341Bom c2216341Bom = new C2216341Bom(str, listLLIIII, mapLJIIZILJ, c19883712qx2, c2216301Boi);
            awS400S0200000_34.invoke(c2216341Bom);
            String string = UUID.randomUUID().toString();
            if (!c2216341Bom.LIZLLL) {
                c2216341Bom.LIZLLL = true;
                C2216331Bol c2216331Bol = new C2216331Bol(str, c2216341Bom.LJ, listLLIIII, mapLJIIZILJ, c19883712qx2, c2216301Boi);
                ((HashMap) C2216321Bok.LIZIZ).put(c2216331Bol.LIZ, c2216331Bol);
                if (!((HashMap) c2216331Bol.LIZLLL).containsKey(string)) {
                    ((HashMap) c2216331Bol.LIZLLL).put(string, new C2216441Bow(c2216331Bol, c2216331Bol.LIZ, string, c2216331Bol.LIZIZ, c2216331Bol.LIZJ, c2216331Bol.LJ));
                    c2216441BowLIZ = c2216331Bol.LIZ(string);
                    if (c2216441BowLIZ == null) {
                        throw new IllegalArgumentException("CreationScope not found");
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(string);
                    sbLIZ.append(" already exists");
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                throw new IllegalStateException("build already invoked");
            }
        }
        final C11HP c11hp = new C11HP();
        c11hp.LL.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        c11hp.LL.handleLifecycleEvent(Lifecycle.Event.ON_START);
        c11hp.LL.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        scene.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.shortvideo.edit.EditPageCreationModelInitializeKotlin$init$2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                C11HP c11hp2 = c11hp;
                c11hp2.LL.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
                c11hp2.LL.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
                c11hp2.LL.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
                C2216321Bok c2216321Bok3 = C2216321Bok.LIZ;
                String str2 = c259800zU.element;
                c2216321Bok3.getClass();
                ((HashMap) C2216321Bok.LIZIZ).remove(str2);
                if (C297290Bl1.LIZ()) {
                    EditPageCreationModelInitializeKotlin.LIZ.getClass();
                    C15O7.LIZJ(new Callable() { // from class: X.1Boh
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C1C7U.LIZ("EditPageCreationModelInitializeKotlin@722e.clearUnusedResources$1");
                            C201955140j.LJIILJJIL(C1662160tM6.LIZIZ, "CreationModelManager clearUnusedResources");
                            C2216321Bok.LIZ.getClass();
                            Iterator<C0W11> it2 = C2216321Bok.LIZJ.iterator();
                            while (it2.hasNext()) {
                                it2.next().LIZIZ();
                            }
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("EditPageCreationModelInitializeKotlin@722e.clearUnusedResources$1");
                            return unit;
                        }
                    });
                }
            }
        });
        if (((Boolean) C280040AyI.LIZ.getValue()).booleanValue()) {
            C2216461Boy c2216461Boy = c2216441BowLIZ.LJIIIZ;
            synchronized (c2216461Boy) {
                c2216431BovLIZIZ = c2216461Boy.LIZ.LIZIZ(CreativeModel.class);
            }
            MutableLiveData<T> mutableLiveData = c2216431BovLIZIZ.LIZIZ;
            C2216391Bor c2216391Bor = InterfaceC2216401Bos.LIZ;
            new AwS576S0100000_32(mutableLiveData, 702);
            AwS578S0100000_34 awS578S0100000_34 = new AwS578S0100000_34(mutableLiveData, 160);
            c2216391Bor.getClass();
            ((LiveData) awS578S0100000_34.invoke()).observe(c11hp, new AObserverS236S0100000_34(videoPublishEditModel, 18));
            return c2216441BowLIZ;
        }
        C2216431Bov c2216431Bov = (C2216431Bov) ((HashMap) c2216441BowLIZ.LJFF).get(CreativeModel.class);
        final Class<InterfaceC2216711BpN> cls = InterfaceC2216711BpN.class;
        Object objNewInstance = c2216431Bov.LIZLLL;
        if (objNewInstance == null) {
            Iterator it2 = ((LinkedHashMap) C2216411Bot.LIZIZ).entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    key = entry2.getKey();
                    Pair pair = (Pair) entry2.getValue();
                    if (Intrinsics.LJFF(pair.getFirst(), InterfaceC2216711BpN.class) || Intrinsics.LJFF(pair.getSecond(), InterfaceC2216711BpN.class)) {
                        break;
                    }
                } else {
                    key = null;
                    break;
                }
            }
            if (key != null) {
                Class cls2 = (Class) ((LinkedHashMap) C2216411Bot.LIZ).get(key);
                if (cls2 != null) {
                    objNewInstance = cls2.getConstructor(LiveData.class, Function0.class, Function1.class).newInstance(c2216431Bov.LIZIZ, new AObjectS408S0100000_34(c2216431Bov, 9), new Function1<Object, Unit>() { // from class: X.01Ao
                        @Override // kotlin.jvm.functions.Function1
                        public final Unit invoke(Object obj2) throws Exception {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(cls.getName());
                            sbLIZ2.append(" can not support write operation");
                            throw new Exception(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    });
                    c2216431Bov.LIZLLL = (InterfaceC21368818ju) objNewInstance;
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("getReaderInternal can not find ");
                    sbLIZ2.append(InterfaceC2216711BpN.class);
                    sbLIZ2.append(" readWriter");
                    throw new Exception(C2188811AlT.LIZIZ(sbLIZ2));
                }
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("getReaderInternal can not find ");
                sbLIZ3.append(InterfaceC2216711BpN.class);
                sbLIZ3.append(" reader");
                throw new Exception(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        ((C11HO) ((InterfaceC21368818ju) objNewInstance)).LJFF(c11hp, new AObserverS236S0100000_34(videoPublishEditModel, 19));
        return c2216441BowLIZ;
    }
}
