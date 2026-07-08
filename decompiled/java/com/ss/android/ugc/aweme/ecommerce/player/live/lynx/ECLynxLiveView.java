package com.ss.android.ugc.aweme.ecommerce.player.live.lynx;

import X.AnonymousClass0317;
import X.C034S;
import X.C0PEM;
import X.C1120604Zw;
import X.C1120704Zx;
import X.C1289960jfm;
import X.C1298720jtu;
import X.C1311730kEt;
import X.C1324840ka2;
import X.C1388190mED;
import X.C1519540pe4;
import X.C1735820vGu;
import X.C1851070yGn;
import X.C1851080yGo;
import X.C1AEE;
import X.C1AQS;
import X.C1DFH;
import X.C20161913uj;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C23250099c;
import X.C770702zh;
import X.C786410Ut5;
import X.C817503Hh;
import X.EnumC1782850wUl;
import X.EnumC1782940wUu;
import X.EnumC2176021AEe;
import X.InterfaceC1294060jmO;
import X.InterfaceC1312540kGC;
import X.InterfaceC1699420uKC;
import X.InterfaceC1967107nB;
import X.InterfaceC2175541ACi;
import X.InterfaceC464060IHs;
import X.InterfaceC497601wk;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.player.live.lynx.ECLynxLiveView;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import j27.s;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC1294060jmO
public final class ECLynxLiveView extends LynxUI<C1AEE> implements View.OnAttachStateChangeListener {
    public static final /* synthetic */ int LLJJIJIIJIL = 0;
    public RemoteImageView LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public volatile boolean LLJ;
    public volatile boolean LLJI;
    public volatile long LLJIJIL;
    public volatile boolean LLJILJIL;
    public volatile boolean LLJILJILJ;
    public C1851080yGo LLJILLL;
    public volatile C1851070yGn LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public String LLJJIJI;

    @InterfaceC1312540kGC(name = "optimizetype")
    public final void setOptimizeType(String str) {
    }

    public final void LJJIJ() throws JSONException {
        C1AEE c1aee = (C1AEE) this.mView;
        c1aee.getClass();
        c1aee.LIZLLL(EnumC2176021AEe.PLAY_SELECTION);
        this.LLJ = false;
        LJJIIZI(false);
        if (this.LLJIJIL > 0 && this.LLJI) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.LLJIJIL);
            EnumC1782940wUu enumC1782940wUu = EnumC1782940wUu.LIVE_CARD_PAUSE;
            LJJIJIIJIL(CardStruct.IStatusCode.DEFAULT, strValueOf, C2097608Jq.LJIIJ(new Pair("code", Integer.valueOf(enumC1782940wUu.getCode())), new Pair("msg", enumC1782940wUu.getMsg())));
        }
        String str = this.LLILZ;
        if (str == null) {
            str = "";
        }
        C1519540pe4.LIZ(Boolean.valueOf(this.LLJ), "rd_ec_media_card_pause", str, this.LLJIJIL > 0 ? String.valueOf(SystemClock.elapsedRealtime() - this.LLJIJIL) : null);
        C1851070yGn c1851070yGn = this.LLJJ;
        if (c1851070yGn != null) {
            c1851070yGn.LIZIZ(c1851070yGn.LJII, "pause", null, null);
        }
    }

    public final void LJJIJIL() {
        String str;
        InterfaceC497601wk lifecycleScope;
        InterfaceC2175541ACi interfaceC2175541ACi;
        String str2 = this.LLILLJJLI;
        if (str2 == null || a0.LJJJIL(str2) || (str = this.LLILZ) == null) {
            return;
        }
        this.LLJJ = null;
        this.LLJJ = new C1851070yGn(str, "lynx");
        C1851070yGn c1851070yGn = this.LLJJ;
        if (c1851070yGn != null) {
            c1851070yGn.LJII = EnumC1782850wUl.TRIGGERED;
            c1851070yGn.LIZJ = SystemClock.elapsedRealtime();
        }
        C1AEE c1aee = (C1AEE) this.mView;
        if (c1aee != null && (interfaceC2175541ACi = c1aee.LLILLJJLI) != null) {
            C1120704Zx.LIZ.getClass();
            C1120704Zx.LIZJ = interfaceC2175541ACi;
        }
        ComponentCallbacks2 componentCallbacks2LIZ = C1388190mED.LIZ(this.mView.getContext());
        LifecycleOwner lifecycleOwnerLIZ = C20161913uj.LIZ(this.mView);
        if ((lifecycleOwnerLIZ == null && (!(componentCallbacks2LIZ instanceof LifecycleOwner) || (lifecycleOwnerLIZ = (LifecycleOwner) componentCallbacks2LIZ) == null)) || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZ)) == null) {
            lifecycleScope = C817503Hh.LL;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ.LLIILII(), null, new C1735820vGu(str2, this, null), 2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() throws JSONException {
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        C1851080yGo c1851080yGo = this.LLJILLL;
        if (c1851080yGo != null) {
            ((C1AEE) this.mView).LJFF(c1851080yGo);
        }
        ((C1AEE) this.mView).LJI();
        String str = this.LLILZ;
        if (str == null) {
            str = "";
        }
        C1519540pe4.LIZ(Boolean.valueOf(this.LLJ), "rd_ec_media_card_destroy", str, this.LLJIJIL > 0 ? String.valueOf(SystemClock.elapsedRealtime() - this.LLJIJIL) : null);
        if (this.LLJIJIL > 0 && this.LLJI) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, IActivityStackDependencyService.class.getName(), anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
            }
            EnumC1782940wUu enumC1782940wUu = ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).isAppBackGround() ? EnumC1782940wUu.LIVE_CARD_DESTROY : EnumC1782940wUu.LIVE_CARD_DETACH;
            LJJIJIIJIL(CardStruct.IStatusCode.DEFAULT, String.valueOf(SystemClock.elapsedRealtime() - this.LLJIJIL), C2097608Jq.LJIIJ(new Pair("code", Integer.valueOf(enumC1782940wUu.getCode())), new Pair("msg", enumC1782940wUu.getMsg())));
        }
        C1851070yGn c1851070yGn = this.LLJJ;
        if (c1851070yGn != null) {
            c1851070yGn.LIZIZ(c1851070yGn.LJII, "destroy", null, null);
        }
        super.destroy();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        if (this.LLIZ && !this.LLJ) {
            LJJIJIL();
        }
        if (this.LLJILJIL) {
            this.LLJILJIL = false;
            String str = this.LLILZ;
            if (str == null) {
                str = "";
            }
            C1519540pe4.LIZJ(this.LLIZ ? 1 : 0, str);
        }
    }

    public ECLynxLiveView(s sVar) {
        super(sVar);
        this.LLJIJIL = -1L;
    }

    public final void LJJIIZI(boolean z) {
        if (z) {
            RemoteImageView remoteImageView = this.LL;
            if (remoteImageView != null) {
                C786410Ut5.l(remoteImageView, 8);
                return;
            }
            return;
        }
        RemoteImageView remoteImageView2 = this.LL;
        if (remoteImageView2 != null) {
            C1324840ka2.LJIIJ(remoteImageView2, this.LLILLL, remoteImageView2.getWidth(), remoteImageView2.getHeight());
            String str = this.LLILLL;
            if (str != null && str.length() != 0 && !this.LLJ) {
                C786410Ut5.l(remoteImageView2, 0);
            } else {
                C786410Ut5.l(remoteImageView2, 8);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void afterPropsUpdated(C1311730kEt c1311730kEt) {
        super.afterPropsUpdated(c1311730kEt);
        if (c1311730kEt != null) {
            if (c1311730kEt.LJIIIIZZ("qualities")) {
                if (this.mView.isAttachedToWindow()) {
                    ((C1AEE) this.mView).LJIIJ(this.LLILZLL, new InterfaceC1699420uKC() { // from class: X.0v0k
                        @Override // X.InterfaceC1699420uKC
                        public final void LIZ(boolean z) {
                            this.LIZ.LJJIJIIJI("switchresolution", C2097608Jq.LJIIJ(new Pair("success", Boolean.valueOf(z))));
                            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("switchResolution: ");
                            sbLIZ.append(z);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            c2341109Fh.getClass();
                            C2341109Fh.LIZJ(strLIZIZ);
                        }
                    });
                }
                if (c1311730kEt == null) {
                    return;
                }
            }
            if (c1311730kEt.LJIIIIZZ("poster")) {
                LJJIIZI(false);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0yGo] */
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        this.LLJILLL = new InterfaceC2175541ACi() { // from class: X.0yGo
            @Override // X.InterfaceC2175541ACi
            public final Integer Dk() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean LLILLIZIL() {
                return false;
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLIL() {
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLLLLIL() {
            }

            @Override // X.InterfaceC2175541ACi
            public final Object Md() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean U1() {
                return true;
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean We() {
                return false;
            }

            @Override // X.InterfaceC2175541ACi
            public final Object Y7() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            public final void o() {
            }

            @Override // X.InterfaceC2175541ACi
            public final void oc(C945320ahu c945320ahu) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void T5() {
                if (this.LL.LLJI) {
                    this.LL.LLJ = true;
                }
                this.LL.LJJIJIIJI("play", null);
                this.LL.LJJIIZI(true);
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LIZJ("playing");
                C1851070yGn c1851070yGn = this.LL.LLJJ;
                if (c1851070yGn != null) {
                    c1851070yGn.LIZIZ(EnumC1782850wUl.FIRST_FRAME, "first_frame", null, null);
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void v() throws JSONException {
                this.LL.LJJIJIIJI("firstframe", null);
                if (this.LL.LLJIJIL > 0 && this.LL.LLJI) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LL.LLJIJIL;
                    this.LL.LLJIJIL = -1L;
                    ECLynxLiveView eCLynxLiveView = this.LL;
                    String strValueOf = String.valueOf(jElapsedRealtime);
                    EnumC1782940wUu enumC1782940wUu = EnumC1782940wUu.SUCCESS;
                    eCLynxLiveView.LJJIJIIJIL("1", strValueOf, C2097608Jq.LJIIJ(new Pair("code", Integer.valueOf(enumC1782940wUu.getCode())), new Pair("msg", enumC1782940wUu.getMsg())));
                }
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LIZJ("firstFrame");
                C1851070yGn c1851070yGn = this.LL.LLJJ;
                if (c1851070yGn != null) {
                    c1851070yGn.LJII = EnumC1782850wUl.PLAYING;
                    c1851070yGn.LJ = SystemClock.elapsedRealtime();
                }
            }

            @Override // X.InterfaceC2175541ACi
            /* JADX INFO: renamed from: if */
            public final void mo29if(String str) {
                this.LL.LJJIJIIJI("ended", null);
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("playCompleted: ");
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LIZJ(strLIZIZ);
                C1851070yGn c1851070yGn = this.LL.LLJJ;
                if (c1851070yGn != null) {
                    c1851070yGn.LIZIZ(c1851070yGn.LJII, "complete", null, null);
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void oe(String str) {
                this.LL.LJJIJIIJI("prepared", null);
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("playPrepared: ");
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LIZJ(strLIZIZ);
                C1851070yGn c1851070yGn = this.LL.LLJJ;
                if (c1851070yGn != null) {
                    c1851070yGn.LJII = EnumC1782850wUl.PREPARED;
                    c1851070yGn.LJFF = SystemClock.elapsedRealtime();
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void sk(String str) {
                this.LL.LJJIJIIJI("sei", C2097608Jq.LJIIJ(new Pair("sei", str)));
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("seiUpdate: ");
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LIZJ(strLIZIZ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v8, types: [com.ss.android.ugc.aweme.ecommerce.player.live.lynx.ECLynxLiveView] */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1, types: [int] */
            /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r5v5 */
            /* JADX WARN: Type inference failed for: r5v6 */
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
            @Override // X.InterfaceC2175541ACi
            public final void w9(String str) throws JSONException {
                ?? LJIIJ;
                Integer num;
                int iLJIIJ = 2;
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    iLJIIJ = C2097608Jq.LJIIJ(new Pair("code", Integer.valueOf(jSONObject.optInt("error_code"))), new Pair("msg", jSONObject.optString("error_description")));
                    LJIIJ = iLJIIJ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    Pair[] pairArr = new Pair[iLJIIJ];
                    EnumC1782940wUu enumC1782940wUu = EnumC1782940wUu.DATA_ERROR;
                    pairArr[0] = new Pair("code", Integer.valueOf(enumC1782940wUu.getCode()));
                    pairArr[1] = new Pair("msg", enumC1782940wUu.getMsg());
                    LJIIJ = C2097608Jq.LJIIJ(pairArr);
                }
                if (this.LL.LLJIJIL > 0 && this.LL.LLJI) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LL.LLJIJIL;
                    this.LL.LLJIJIL = -1L;
                    this.LL.LJJIJIIJIL(CardStruct.IStatusCode.DEFAULT, String.valueOf(jElapsedRealtime), LJIIJ);
                }
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LIZJ("playerMediaError: " + str);
                C1851070yGn c1851070yGn = this.LL.LLJJ;
                if (c1851070yGn != null) {
                    Object objLIZ = C7726030a.LIZ("code", LJIIJ);
                    String str2 = null;
                    if (objLIZ instanceof Integer) {
                        num = (Integer) objLIZ;
                    } else {
                        num = null;
                    }
                    Object objLIZ2 = C7726030a.LIZ("msg", LJIIJ);
                    if (objLIZ2 instanceof String) {
                        str2 = (String) objLIZ2;
                    }
                    c1851070yGn.LIZIZ(EnumC1782850wUl.ERROR, "error", num, str2);
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLLJ(EnumC1913550ztZ enumC1913550ztZ, Object obj) {
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPlayerMessage: ");
                sbLIZ.append(enumC1913550ztZ.name());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LIZJ(strLIZIZ);
            }

            @Override // X.InterfaceC2175541ACi
            public final void Th(int i, int i2, View view) {
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LIZJ("onVideoSizeChange: video size changed");
            }
        };
        RemoteImageView remoteImageView = new RemoteImageView(context);
        C786410Ut5.f7(remoteImageView, new ViewGroup.LayoutParams(-1, -1));
        C786410Ut5.l(remoteImageView, 8);
        this.LL = remoteImageView;
        C1AEE c1aee = new C1AEE(context, null, 6);
        C1851080yGo c1851080yGo = this.LLJILLL;
        c1aee.LLILLJJLI = c1851080yGo;
        C1120704Zx.LIZ.getClass();
        C1120704Zx.LIZJ = c1851080yGo;
        c1aee.addView(this.LL);
        C1519540pe4.LIZ(null, "rd_ec_media_card_create", "", null);
        return c1aee;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.LLILLJJLI != null) {
            LJJIIZI(false);
            LJJIJIL();
        }
        String str = this.LLILZ;
        if (str == null) {
            str = "";
        }
        C1519540pe4.LIZ(null, "rd_ec_media_card_attach", str, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        String strValueOf;
        C1851080yGo c1851080yGo = this.LLJILLL;
        if (c1851080yGo != null) {
            ((C1AEE) this.mView).LJFF(c1851080yGo);
        }
        String str = this.LLILZ;
        if (str == null) {
            str = "";
        }
        if (this.LLJIJIL > 0) {
            strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.LLJIJIL);
        } else {
            strValueOf = null;
        }
        C1519540pe4.LIZ(Boolean.valueOf(this.LLJ), "rd_ec_media_card_detach", str, strValueOf);
        C1851070yGn c1851070yGn = this.LLJJ;
        if (c1851070yGn != null) {
            c1851070yGn.LIZIZ(EnumC1782850wUl.UNKNOWN, "unknown", null, null);
        }
    }

    @InterfaceC1967107nB
    public final void pause(ReadableMap readableMap) throws JSONException {
        String string;
        if (readableMap != null) {
            string = readableMap.getString("uuid");
        } else {
            string = null;
        }
        if (!TextUtils.equals(string, this.LLILZIL)) {
            return;
        }
        C1AEE c1aee = (C1AEE) this.mView;
        if (c1aee != null && !c1aee.LIZIZ()) {
            return;
        }
        LJJIJ();
    }

    @InterfaceC1967107nB
    public final void play(ReadableMap readableMap) {
        LJJIJIL();
        LJJIIZI(false);
        this.LLJILJILJ = false;
        String str = this.LLILZ;
        if (str == null) {
            str = "";
        }
        C1519540pe4.LIZJ(this.LLIZ ? 1 : 0, str);
    }

    @InterfaceC1312540kGC(name = "actiontype")
    public final void setActionType(String str) {
        this.LLJJIJI = str;
    }

    @InterfaceC1312540kGC(name = "autoplay")
    public final void setAutoPlay(Boolean bool) {
        boolean zBooleanValue;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (zBooleanValue != this.LLIZ) {
            this.LLIZ = zBooleanValue;
            this.LLJILJIL = true;
            this.LLJILJILJ = false;
        }
    }

    @InterfaceC1312540kGC(name = "enterfrommerge")
    public final void setEnterFromMerge(String str) {
        this.LLJJI = str;
    }

    @InterfaceC1312540kGC(name = "entermethod")
    public final void setEnterMethod(String str) {
        this.LLJJIII = str;
    }

    @InterfaceC1312540kGC(name = "mute")
    public final void setMute(Boolean bool) {
        boolean zBooleanValue = false;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            ((C1AEE) this.mView).setMute(true);
        } else {
            ((C1AEE) this.mView).setMute(false);
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        this.LLIZLLLIL = zBooleanValue;
    }

    @InterfaceC1312540kGC(name = "objectfit")
    public final void setObjectfit(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            if (Intrinsics.LJFF(str, "cover")) {
                InterfaceC464060IHs textureView = ((C1AEE) this.mView).getTextureView();
                if (textureView != null) {
                    textureView.setScaleType(2);
                }
                RemoteImageView remoteImageView = this.LL;
                if (remoteImageView != null) {
                    remoteImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                }
                LJJIIZI(false);
                return;
            }
            if (!Intrinsics.LJFF(str, "contain")) {
                return;
            }
            InterfaceC464060IHs textureView2 = ((C1AEE) this.mView).getTextureView();
            if (textureView2 != null) {
                textureView2.setScaleType(1);
            }
            RemoteImageView remoteImageView2 = this.LL;
            if (remoteImageView2 != null) {
                remoteImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
            LJJIIZI(false);
        }
    }

    @InterfaceC1312540kGC(name = "poster")
    public final void setPoster(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            this.LLILLL = str;
        }
    }

    @InterfaceC1312540kGC(name = "qualities")
    public final void setQualities(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            this.LLILZLL = str;
        }
    }

    @InterfaceC1312540kGC(name = "roomid")
    public final void setRoomId(String str) {
        this.LLILZ = str;
    }

    @InterfaceC1312540kGC(name = "streamurl")
    public final void setStreamURL(String str) throws JSONException {
        if (str != null && !a0.LJJJIL(str)) {
            if (C770702zh.LIZIZ(this.LLILLJJLI) && !TextUtils.equals(this.LLILLJJLI, str)) {
                LJJIJ();
            }
            this.LLILLJJLI = str;
        }
    }

    @InterfaceC1312540kGC(name = "uuid")
    public final void setUuId(String str) {
        this.LLILZIL = str;
    }

    @InterfaceC1967107nB
    public final void stop(ReadableMap readableMap) throws JSONException {
        String strValueOf;
        ((C1AEE) this.mView).LJIIIZ();
        this.LLJ = false;
        LJJIIZI(false);
        if (this.LLJIJIL > 0 && this.LLJI) {
            String strValueOf2 = String.valueOf(SystemClock.elapsedRealtime() - this.LLJIJIL);
            EnumC1782940wUu enumC1782940wUu = EnumC1782940wUu.LIVE_CARD_STOP;
            LJJIJIIJIL(CardStruct.IStatusCode.DEFAULT, strValueOf2, C2097608Jq.LJIIJ(new Pair("code", Integer.valueOf(enumC1782940wUu.getCode())), new Pair("msg", enumC1782940wUu.getMsg())));
        }
        String str = this.LLILZ;
        if (str == null) {
            str = "";
        }
        if (this.LLJIJIL > 0) {
            strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.LLJIJIL);
        } else {
            strValueOf = null;
        }
        C1519540pe4.LIZ(Boolean.valueOf(this.LLJ), "rd_ec_media_card_stop", str, strValueOf);
        C1851070yGn c1851070yGn = this.LLJJ;
        if (c1851070yGn != null) {
            c1851070yGn.LIZIZ(c1851070yGn.LJII, "stop", null, null);
        }
    }

    public final void LJJIJIIJI(String str, Map<String, ? extends Object> map) {
        C1298720jtu c1298720jtu;
        if (map == null) {
            map = new LinkedHashMap<>();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        String str2 = this.LLILZIL;
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("uuid", str2);
        C1289960jfm c1289960jfm = new C1289960jfm(getSign(), str, linkedHashMap);
        s sVar = this.mContext;
        if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
            c1298720jtu.LIZIZ(c1289960jfm);
        }
    }

    public final void LJJIJIIJIL(String str, String str2, Map<String, Object> map) throws JSONException {
        String string;
        if (!this.LLJILJILJ) {
            this.LLJILJILJ = true;
            Object obj = map.get("code");
            String str3 = "";
            if (obj == null || (string = obj.toString()) == null) {
                string = "";
            }
            String str4 = this.LLILZ;
            if (str4 != null) {
                str3 = str4;
            }
            C1519540pe4.LIZIZ(str2, str, string, str3);
            if (!Intrinsics.LJFF(map.get("code"), Integer.valueOf(EnumC1782940wUu.SUCCESS.getCode()))) {
                LJJIJIIJI("error", map);
            }
        }
    }
}
