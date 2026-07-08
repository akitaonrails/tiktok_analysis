package com.bytedance.ies.xelement.video.pro;

import X.AbstractC1299960jvu;
import X.C1289960jfm;
import X.C1290210jgB;
import X.C1298530jtb;
import X.C1298720jtu;
import X.C1301600jyY;
import X.C1311730kEt;
import X.C1313270kHN;
import X.C1313900kIO;
import X.C1470240oMY;
import X.C1473400oRe;
import X.C1474420oTI;
import X.C1486020om0;
import X.C1486040om2;
import X.C1486280omQ;
import X.C1AM9;
import X.C1AMB;
import X.C1AME;
import X.C1AMG;
import X.C2097608Jq;
import X.C2178641AOg;
import X.C2178651AOh;
import X.C2188811AlT;
import X.C259800zU;
import X.EnumC1299880jvm;
import X.EnumC1311070kDp;
import X.EnumC1486640on0;
import X.InterfaceC1290540jgi;
import X.InterfaceC1312540kGC;
import X.InterfaceC1474390oTF;
import X.InterfaceC1547990qNx;
import X.InterfaceC1967107nB;
import Y.ARunnableS128S0100000_28;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ies.xelement.video.pro.LynxVideoUI;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.android.videoshop.context.VideoContext;
import j27.s;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS389S0200000_23;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class LynxVideoUI extends UISimpleView<C1AM9> implements GenericLifecycleObserver {
    public static final /* synthetic */ int LLJJJIL = 0;
    public final String LL;
    public C1474420oTI LLILLJJLI;
    public EnumC1486640on0 LLILLL;
    public String LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public String LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public boolean LLJILLL;
    public String LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public InterfaceC1547990qNx<C1290210jgB> LLJJIJI;
    public AbstractC1299960jvu LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public InterfaceC1474390oTF LLJJJ;

    public LynxVideoUI() {
        throw null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onHostResume(lifecycleOwner);
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onHostPause(lifecycleOwner);
        }
    }

    @InterfaceC1312540kGC(name = "cache-size")
    public final void setCacheSize(int i) {
    }

    @InterfaceC1312540kGC(name = "rate")
    public final void setRate(double d) {
    }

    @InterfaceC1312540kGC(name = "volume")
    public final void setVolume(float f) {
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final EnumC1311070kDp getMeaningfulContentStatus() {
        return this.LLILLL.compareTo(EnumC1486640on0.READY) > 0 ? EnumC1311070kDp.PRESENTED : EnumC1311070kDp.PENDING;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onNodeRemoved() {
        TraceEvent.LIZIZ("LynxVideoUI::onNodeRemoved");
        super.onNodeRemoved();
        LJJIJIIJI(null);
        TraceEvent.LJII("LynxVideoUI::onNodeRemoved");
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        super.destroy();
        this.LLILLL = EnumC1486640on0.DESTROY;
        C1AM9 c1am9 = (C1AM9) this.mView;
        C1AME c1ame = c1am9.LL;
        C1486020om0 c1486020om0 = c1am9.LLILLL;
        VideoContext videoContext = c1ame.LLILZIL;
        if (videoContext != null && c1486020om0 != null) {
            ((CopyOnWriteArrayList) videoContext.LLJI).remove(c1486020om0);
        }
        c1am9.LL.LJIIIIZZ();
        try {
            VideoContext videoContextLJJJJLL = VideoContext.LJJJJLL(c1am9.getContext());
            if (videoContextLJJJJLL != null) {
                videoContextLJJJJLL.LJJLIIIJL(null);
            }
            VideoContext videoContextLJJJJLL2 = VideoContext.LJJJJLL(c1am9.getContext());
            if (videoContextLJJJJLL2 != null) {
                videoContextLJJJJLL2.LJJLIIIJLLLLLLLZ(null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Fail to set VideoContext's objects to null ");
            sbLIZ.append(e);
            LynxLog.e("LynxVideoView", C2188811AlT.LIZIZ(sbLIZ));
        }
        Object baseContext = this.mContext.getBaseContext();
        if (!(baseContext instanceof LifecycleOwner) || (lifecycleOwner = (LifecycleOwner) baseContext) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.removeObserver(this);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void initialize() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        super.initialize();
        this.LLILLL = EnumC1486640on0.INIT;
        Object baseContext = this.mContext.getBaseContext();
        if (!(baseContext instanceof LifecycleOwner) || (lifecycleOwner = (LifecycleOwner) baseContext) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(this);
    }

    public final void LJJIIZI(Callback callback) {
        boolean z;
        VideoContext videoContext;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        C1AME c1ame = ((C1AM9) this.mView).LL;
        VideoContext videoContext2 = c1ame.LLILZIL;
        if (videoContext2 != null && videoContext2.LJJJJZI(c1ame) && c1ame.LLILZIL.LJJJLIIL()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            javaOnlyMap.putString("msg", "already fullscreen");
            if (callback != null) {
                callback.invoke(0, javaOnlyMap);
                return;
            }
            return;
        }
        C1AM9 c1am9 = (C1AM9) this.mView;
        c1am9.LIZIZ();
        C2178641AOg c2178641AOg = c1am9.LL.LLILLL;
        if (c2178641AOg != null && (videoContext = c2178641AOg.LLLFFI) != null && (videoContext.LJJJJLI() == null || !(!TextUtils.isEmpty(null)))) {
            C2178651AOh c2178651AOh = videoContext.LL;
            if (c2178651AOh.LLILZLL == 0) {
                c2178651AOh.LLJJJ.LJJJJJ(new ARunnableS128S0100000_28(c2178651AOh, 61));
            }
        }
        if (callback == null) {
            return;
        }
        callback.invoke(0, javaOnlyMap);
    }

    public final void LJJIJ(Callback callback) {
        boolean z;
        boolean z2;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        C1AME c1ame = ((C1AM9) this.mView).LL;
        VideoContext videoContext = c1ame.LLILZIL;
        if (videoContext != null && videoContext.LJJJJZI(c1ame) && c1ame.LLILZIL.LJJJLIIL()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C1AM9 c1am9 = (C1AM9) this.mView;
            C2178651AOh c2178651AOh = VideoContext.LJJJJLL(c1am9.getContext()).LL;
            c2178651AOh.LLJILJIL = -1;
            if (!C1486280omQ.LJ(-1) && !C1486280omQ.LJFF(-1)) {
                z2 = false;
            } else {
                z2 = true;
            }
            c2178651AOh.LLJIJIL = z2;
            C1AME c1ame2 = c1am9.LL;
            C2178641AOg c2178641AOg = c1ame2.LLILLL;
            if (c2178641AOg != null) {
                VideoContext videoContext2 = c2178641AOg.LLLFFI;
                if (videoContext2 != null && (videoContext2.LJJJJLI() == null || !(!TextUtils.isEmpty(null)))) {
                    videoContext2.LL.LJ(false, false);
                }
            } else {
                VideoContext videoContext3 = c1ame2.LLILZIL;
                if (videoContext3 != null && videoContext3.LJJJJZI(c1ame2)) {
                    VideoContext videoContext4 = c1ame2.LLILZIL;
                    if (videoContext4.LJJJJLI() == null || !(!TextUtils.isEmpty(null))) {
                        videoContext4.LL.LJ(false, false);
                    }
                }
            }
            if (callback != null) {
                callback.invoke(0, javaOnlyMap);
                return;
            }
            return;
        }
        javaOnlyMap.putString("msg", "not in fullscreen");
        if (callback == null) {
            return;
        }
        callback.invoke(0, javaOnlyMap);
    }

    public final void LJJIJIIJI(Callback callback) {
        this.LLILLL = ((C1AM9) this.mView).LIZ();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        int i = C1486040om2.LIZ[this.LLILLL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("error state: ");
                    sbLIZ.append(this.LLILLL);
                    javaOnlyMap.putString("error", C2188811AlT.LIZIZ(sbLIZ));
                    String str = this.LL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("invoke pause in wrong state: ");
                    sbLIZ2.append(this.LLILLL);
                    LynxLog.e(str, C2188811AlT.LIZIZ(sbLIZ2));
                    if (callback != null) {
                        callback.invoke(1, javaOnlyMap);
                        return;
                    }
                    return;
                }
                ((C1AM9) this.mView).LL.LJFF();
                if (callback == null) {
                    return;
                }
                callback.invoke(0, javaOnlyMap);
                return;
            }
            javaOnlyMap.putString("msg", "already pause");
            if (callback == null) {
                return;
            }
            callback.invoke(0, javaOnlyMap);
            return;
        }
        javaOnlyMap.putString("msg", "just ready");
        if (callback == null) {
            return;
        }
        callback.invoke(0, javaOnlyMap);
    }

    public final void LJJIJIIJIL(Callback callback) {
        if (this.LLILLL != EnumC1486640on0.READY) {
            this.LLILLL = ((C1AM9) this.mView).LIZ();
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        int i = C1486040om2.LIZ[this.LLILLL.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("error state: ");
                sbLIZ.append(this.LLILLL);
                javaOnlyMap.putString("error", C2188811AlT.LIZIZ(sbLIZ));
                String str = this.LL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("invoke play in wrong state: ");
                sbLIZ2.append(this.LLILLL);
                LynxLog.e(str, C2188811AlT.LIZIZ(sbLIZ2));
                if (callback != null) {
                    callback.invoke(1, javaOnlyMap);
                    return;
                }
                return;
            }
            javaOnlyMap.putString("msg", "already play");
            if (callback == null) {
                return;
            }
            callback.invoke(0, javaOnlyMap);
            return;
        }
        C1AM9 c1am9 = (C1AM9) this.mView;
        c1am9.LIZIZ();
        c1am9.LL.LJI();
        this.LLJJIII = false;
        if (callback == null) {
            return;
        }
        callback.invoke(0, javaOnlyMap);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void afterPropsUpdated(C1311730kEt c1311730kEt) {
        ReadableMap readableMap;
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator;
        String str;
        List listLJJLIIIJILLIZJL;
        JSONObject jSONObject;
        boolean z;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String str2;
        int i;
        C1290210jgB c1290210jgBLIZ;
        String str3;
        super.afterPropsUpdated(c1311730kEt);
        if (this.LLJJI) {
            this.LLJJIII = false;
            AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(this, 337);
            this.LLILLL = EnumC1486640on0.CREATE;
            C1474420oTI c1474420oTI = new C1474420oTI();
            final String str4 = "";
            if (u.LJJIIJZLJL(this.LLILZ, "https://", false) || u.LJJIIJZLJL(this.LLILZ, "http://", false)) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                str4 = this.LLILZ;
                str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            } else if (u.LJJIIJZLJL(this.LLILZ, "video://", false)) {
                Uri uri = UriProtector.parse(this.LLILZ);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "play_url");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                }
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "video_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "video_model");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
                    str4 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
                }
                str2 = str4;
                str4 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("illegal source: ");
                sbLIZ.append(this.LLILZ);
                sendEvent("error", C2097608Jq.LJI(new Pair("errorCode", 1), new Pair("errorMsg", C2188811AlT.LIZIZ(sbLIZ)), new Pair("url", this.LLILZ)));
                String str5 = this.LL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("illegal source: ");
                sbLIZ2.append(this.LLILZ);
                LynxLog.e(str5, C2188811AlT.LIZIZ(sbLIZ2));
                str2 = "";
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
            }
            String str6 = this.LL;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("parse url: ");
            sbLIZ3.append(str4);
            sbLIZ3.append(", vid: ");
            sbLIZ3.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            LynxLog.d(str6, C2188811AlT.LIZIZ(sbLIZ3));
            c1474420oTI.LIZIZ = System.currentTimeMillis();
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() > 0) {
                if (this.LLJJJ == null) {
                    sendEvent("error", C2097608Jq.LJI(new Pair("errorCode", 4), new Pair("errorMsg", "No Url Constructor"), new Pair("url", this.LLILZ)));
                } else {
                    c1474420oTI.LIZ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                }
            }
            if (str4.length() > 0 && this.LLJILLL) {
                c1474420oTI.LJFF = str4;
                String strValueOf = this.LLJJ;
                if (strValueOf.length() == 0) {
                    strValueOf = String.valueOf(str4.hashCode());
                }
                c1474420oTI.LJI = strValueOf;
            } else {
                c1474420oTI.LJ = str4;
            }
            if (str2.length() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str2);
                    C1470240oMY c1470240oMY = new C1470240oMY();
                    C1473400oRe c1473400oRe = new C1473400oRe();
                    c1473400oRe.LIZJ(jSONObject2);
                    c1470240oMY.LJJIJLIJ(c1473400oRe);
                    c1474420oTI.LIZLLL = c1470240oMY;
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("video_model JSON parse error: ");
                    sbLIZ4.append(e.getMessage());
                    sendEvent("error", C2097608Jq.LJI(new Pair("errorCode", 1), new Pair("errorMsg", C2188811AlT.LIZIZ(sbLIZ4)), new Pair("url", this.LLILZ)));
                }
            }
            c1474420oTI.LJII = this.LLJILJIL;
            c1474420oTI.LIZJ = this.LLIZLLLIL;
            String str7 = this.LLJI;
            if (Intrinsics.LJFF(str7, "contain")) {
                i = 0;
            } else if (Intrinsics.LJFF(str7, "cover")) {
                i = 2;
            } else {
                i = 1;
            }
            C1AMB c1amb = new C1AMB();
            c1amb.LIZ = i;
            c1amb.LIZIZ = this.LLILZIL;
            c1amb.LIZJ = this.LLIZ;
            c1amb.LJ = 14;
            c1amb.LIZLLL = 2;
            c1474420oTI.LJIIIIZZ = new C1AMG(c1amb);
            this.LLILLJJLI = c1474420oTI;
            if (!a0.LJJJIL(str4)) {
                final AwS389S0200000_23 awS389S0200000_23 = new AwS389S0200000_23(this, awS577S0100000_33, 26);
                if (this.LLJJIJIL) {
                    AbstractC1299960jvu abstractC1299960jvu = this.LLJJIJIIJIL;
                    if (abstractC1299960jvu != null) {
                        abstractC1299960jvu.LIZJ(new C1301600jyY(str4, EnumC1299880jvm.LynxResourceTypeVideo), new InterfaceC1290540jgi() { // from class: X.0jfg
                            @Override // X.InterfaceC1290540jgi
                            public final void LIZ(C1289590jfB c1289590jfB) {
                                CharSequence charSequence;
                                Function1 function1 = awS389S0200000_23;
                                String str8 = str4;
                                int i2 = LynxVideoUI.LLJJJIL;
                                if (c1289590jfB.LIZ == EnumC1288980jeC.SUCCESS && (charSequence = (CharSequence) c1289590jfB.LIZIZ) != null && !a0.LJJJIL(charSequence)) {
                                    if (function1 != null) {
                                        function1.invoke(c1289590jfB.LIZIZ);
                                    }
                                } else {
                                    if (function1 == null) {
                                        return;
                                    }
                                    function1.invoke(str8);
                                }
                            }
                        });
                    }
                } else {
                    InterfaceC1547990qNx<C1290210jgB> interfaceC1547990qNx = this.LLJJIJI;
                    if (interfaceC1547990qNx != null && (c1290210jgBLIZ = interfaceC1547990qNx.LIZ(str4)) != null && (str3 = c1290210jgBLIZ.LIZ) != null) {
                        str4 = str3;
                    }
                    awS389S0200000_23.invoke(str4);
                }
            } else {
                this.LLILLL = EnumC1486640on0.READY;
                sendEvent("ready", new HashMap());
                awS577S0100000_33.invoke();
            }
            this.LLJJI = false;
            return;
        }
        if (c1311730kEt != null && (readableMap = c1311730kEt.LIZ) != null && (readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator()) != null) {
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                if (Intrinsics.LJFF(strNextKey, "muted")) {
                    ((C1AM9) this.mView).setMuted(this.LLILZIL);
                } else if (Intrinsics.LJFF(strNextKey, "__control") && (str = this.LLJIJIL) != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"_*_"}, 0, 6)) != null) {
                    String str8 = (String) ListProtector.get(listLJJLIIIJILLIZJL, 0);
                    switch (str8.hashCode()) {
                        case -1879513255:
                            if (str8.equals("exitfullscreen")) {
                                LJJIJ(null);
                            }
                            break;
                        case -619198582:
                            if (str8.equals("requestfullscreen")) {
                                LJJIIZI(null);
                            }
                            break;
                        case 3443508:
                            if (str8.equals("play")) {
                                LJJIJIIJIL(null);
                            }
                            break;
                        case 3526264:
                            if (str8.equals("seek")) {
                                try {
                                    jSONObject = new JSONObject((String) listLJJLIIIJILLIZJL.get(1));
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    jSONObject = new JSONObject();
                                }
                                long jOptLong = jSONObject.optLong("position", 0L);
                                if (jSONObject.optInt("play") == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                LJJIJIL(jOptLong, z, null);
                                break;
                            }
                            break;
                        case 106440182:
                            if (str8.equals("pause")) {
                                this.LLJJIII = true;
                                LJJIJIIJI(null);
                            }
                            break;
                    }
                }
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        boolean z;
        s sVarLIZIZ = C1298530jtb.LIZIZ(context);
        if (sVarLIZIZ != null) {
            AbstractC1299960jvu abstractC1299960jvu = sVarLIZIZ.LLL;
            this.LLJJIJIIJIL = abstractC1299960jvu;
            if (abstractC1299960jvu != null) {
                z = true;
            } else {
                z = false;
            }
            this.LLJJIJIL = z;
        }
        return new C1AM9(this, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onBorderRadiusUpdated(int i) {
        C1313900kIO c1313900kIOLJIIL;
        boolean z;
        super.onBorderRadiusUpdated(i);
        C259800zU c259800zU = new C259800zU();
        C1313270kHN c1313270kHN = this.mLynxBackground;
        if (c1313270kHN != null && (c1313900kIOLJIIL = c1313270kHN.LJIIL()) != null) {
            int paddingLeft = this.mView.getPaddingLeft();
            int paddingRight = this.mView.getPaddingRight();
            int paddingTop = this.mView.getPaddingTop();
            int paddingBottom = this.mView.getPaddingBottom();
            c1313900kIOLJIIL.LIZLLL(this.mView.getWidth() + paddingLeft + paddingRight, this.mView.getHeight() + paddingTop + paddingBottom);
            float[] fArrLIZ = c1313900kIOLJIIL.LIZ();
            T t = 0;
            t = 0;
            if (fArrLIZ != null) {
                int i2 = 0;
                if (fArrLIZ.length == 8) {
                    z = true;
                } else {
                    z = false;
                }
                if (Boolean.valueOf(z).booleanValue()) {
                    float f = paddingLeft;
                    float f2 = paddingTop;
                    float f3 = paddingRight;
                    float f4 = paddingBottom;
                    float[] fArr = {f, f2, f3, f2, f3, f4, f, f4};
                    do {
                        fArrLIZ[i2] = Math.max(0.0f, fArrLIZ[i2] - fArr[i2]);
                        i2++;
                    } while (i2 < 8);
                    t = fArrLIZ;
                }
            }
            c259800zU.element = t;
        }
        ((C1AM9) this.mView).setBorderRadius((float[]) c259800zU.element);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onHostPause(LifecycleOwner lifecycleOwner) {
        if (this.LLJ) {
            LJJIJIIJI(null);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onHostResume(LifecycleOwner lifecycleOwner) {
        if (this.LLJ && !this.LLJJIII) {
            LJJIJIIJIL(null);
        }
    }

    @InterfaceC1312540kGC(name = "autolifecycle")
    public final void setAutoLifeCycle(boolean z) {
        this.LLJ = z;
    }

    @InterfaceC1312540kGC(name = "autoplay")
    public final void setAutoPlay(boolean z) {
        this.LLILZLL = z;
    }

    @InterfaceC1312540kGC(name = "cache")
    public final void setCache(boolean z) {
        this.LLJILLL = z;
    }

    @InterfaceC1312540kGC(name = "__control")
    public final void setControl(String str) {
        this.LLJIJIL = str;
    }

    @InterfaceC1312540kGC(name = "inittime")
    public final void setInitTime(int i) {
        this.LLIZLLLIL = i;
    }

    @InterfaceC1312540kGC(name = "loop")
    public final void setLoop(boolean z) {
        this.LLIZ = z;
    }

    @InterfaceC1312540kGC(name = "muted")
    public final void setMuted(boolean z) {
        this.LLILZIL = z;
    }

    @InterfaceC1312540kGC(name = "objectfit")
    public final void setObjectFit(String str) {
        this.LLJI = str;
    }

    @InterfaceC1312540kGC(name = "poster")
    public final void setPoster(String str) {
        this.LLJILJILJ = str;
    }

    @InterfaceC1312540kGC(name = "preload-key")
    public final void setPreloadKey(String str) {
        this.LLJJ = str;
    }

    @InterfaceC1312540kGC(name = "src")
    public final void setSrc(String str) {
        if (str != null) {
            this.LLJJI = true ^ Intrinsics.LJFF(this.LLILZ, str);
            this.LLILZ = str;
            String str2 = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set Src: ");
            sbLIZ.append(str);
            LynxLog.i(str2, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        LynxLog.e(this.LL, "src is null");
        sendEvent("error", C2097608Jq.LJI(new Pair("src is null", "msg")));
    }

    @InterfaceC1312540kGC(name = "video-tag")
    public final void setVideoTag(String str) {
        this.LLJILJIL = str;
    }

    public LynxVideoUI(s sVar, Object obj) {
        super(sVar, obj);
        this.LL = "LynxVideoUI";
        this.LLILLL = EnumC1486640on0.INIT;
        this.LLILZ = "";
        this.LLJI = "contain";
        this.LLJIJIL = "";
        this.LLJILJIL = "";
        this.LLJILJILJ = "";
        this.LLJILLL = true;
        this.LLJJ = "";
    }

    @InterfaceC1967107nB
    public final void exitFullScreen(ReadableMap readableMap, Callback callback) {
        LJJIJ(callback);
    }

    @InterfaceC1967107nB
    public final void getDuration(ReadableMap readableMap, Callback callback) {
        callback.invoke(0, Integer.valueOf(((C1AM9) this.mView).getDuration()));
    }

    @InterfaceC1967107nB
    public final void pause(ReadableMap readableMap, Callback callback) {
        this.LLJJIII = true;
        LJJIJIIJI(callback);
    }

    @InterfaceC1967107nB
    public final void play(ReadableMap readableMap, Callback callback) {
        LJJIJIIJIL(callback);
    }

    @InterfaceC1967107nB
    public final void requestFullScreen(ReadableMap readableMap, Callback callback) {
        LJJIIZI(callback);
    }

    @InterfaceC1967107nB
    public final void seek(ReadableMap readableMap, Callback callback) {
        LJJIJIL(readableMap.getLong("position"), readableMap.getBoolean("play"), callback);
    }

    public final void sendEvent(String str, Map<String, ? extends Object> map) {
        C1298720jtu c1298720jtu;
        s sVar = this.mContext;
        if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
            C1289960jfm c1289960jfm = new C1289960jfm(getSign(), str);
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                c1289960jfm.LIZIZ(entry.getValue(), entry.getKey());
            }
            c1298720jtu.LIZIZ(c1289960jfm);
        }
    }

    @InterfaceC1967107nB
    public final void stop(ReadableMap readableMap, Callback callback) {
        this.LLILLL = ((C1AM9) this.mView).LIZ();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        int i = C1486040om2.LIZ[this.LLILLL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("error state: ");
                    sbLIZ.append(this.LLILLL);
                    javaOnlyMap.putString("msg", C2188811AlT.LIZIZ(sbLIZ));
                    String str = this.LL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("invoke stop in wrong state: ");
                    sbLIZ2.append(this.LLILLL);
                    LynxLog.e(str, C2188811AlT.LIZIZ(sbLIZ2));
                    if (callback != null) {
                        callback.invoke(1, javaOnlyMap);
                        return;
                    }
                    return;
                }
                C1AM9 c1am9 = (C1AM9) this.mView;
                c1am9.LL.LJFF();
                c1am9.LL.LJIIIZ(0L);
                if (callback == null) {
                    return;
                }
                callback.invoke(0, javaOnlyMap);
                return;
            }
            ((C1AM9) this.mView).LIZLLL(0L, false);
            if (callback == null) {
                return;
            }
            callback.invoke(0, javaOnlyMap);
            return;
        }
        javaOnlyMap.putString("msg", "just ready");
        if (callback == null) {
            return;
        }
        callback.invoke(0, javaOnlyMap);
    }

    public final void LJJIJIL(long j, boolean z, Callback callback) {
        this.LLILLL = ((C1AM9) this.mView).LIZ();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        int i = C1486040om2.LIZ[this.LLILLL.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error state: ");
            sbLIZ.append(this.LLILLL);
            javaOnlyMap.putString("msg", C2188811AlT.LIZIZ(sbLIZ));
            String str = this.LL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("invoke seek in wrong state: ");
            sbLIZ2.append(this.LLILLL);
            LynxLog.e(str, C2188811AlT.LIZIZ(sbLIZ2));
            if (callback != null) {
                callback.invoke(1, javaOnlyMap);
                return;
            }
            return;
        }
        ((C1AM9) this.mView).LIZLLL(j, z);
        if (callback == null) {
            return;
        }
        callback.invoke(0, javaOnlyMap);
    }
}
