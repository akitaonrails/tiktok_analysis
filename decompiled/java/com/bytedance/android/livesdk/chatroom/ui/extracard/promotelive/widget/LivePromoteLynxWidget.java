package com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget;

import X.C018Q;
import X.C098200Yq;
import X.C0J39;
import X.C1051630dTN;
import X.C1097680efe;
import X.C1161920gLG;
import X.C1324720kZq;
import X.C1529590puH;
import X.C1529880puk;
import X.C1537060q6K;
import X.C1548820qPI;
import X.C189200o6;
import X.C20441214yg;
import X.C2188811AlT;
import X.C262100zr;
import X.C389001fE;
import X.C470030Ibx;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC1538460q8a;
import X.InterfaceC1105930esx;
import X.InterfaceC1107590evd;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.chatroom.ui.extracard.LiveInnerWatchHistoryExtraCountSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostBackToInnerSetting;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.room.EncourageGoLiveCard;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePromoteLynxWidget extends LivePromoteParentWidget {
    public FrameLayout LLJJJJ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJJJJIL;
    public View LLJJJJLIIL;
    public long LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget
    public final int E1() {
        return -1;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hju;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveNewStyleCardWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget
    public final void z1() {
        this.LLJJLIIIJLLLLLLLZ = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append(this.LLJJLIIIJLLLLLLLZ);
        C20441214yg.LIZIZ("LivePromoteLynxWidget", C2188811AlT.LIZIZ(sbLIZ));
        View view = this.LLJJJJLIIL;
        if (view != null) {
            C500260Jjc.LLFFF(view);
        }
        View view2 = this.LLJJJJLIIL;
        if (view2 != null) {
            view2.setOnTouchListener(new View.OnTouchListener() { // from class: X.0IcD
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    return true;
                }
            });
        }
    }

    public final JSONObject T1() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.LLILLJJLI;
        if (str == null) {
            str = "";
        }
        jSONObject.put("enter_from", str);
        String str2 = this.LLILZ;
        jSONObject.put("request_id", str2 != null ? str2 : "");
        jSONObject.put("extra", C018Q.LIZ(LiveInnerWatchHistoryExtraCountSetting.INSTANCE.getValue()));
        return jSONObject;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget
    public final boolean P1() {
        if (G1()) {
            EncourageGoLiveCard encourageGoLiveCard = this.LLILZLL;
            return ((((int) encourageGoLiveCard.lynxModuleUse) & 4) == 4) && (encourageGoLiveCard.lynxBgMusic.length() > 0);
        }
        int i = this.LLILZLL.style;
        return i == 0 || i == 2 || i == 4;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget
    public final boolean Q1() {
        if (!G1()) {
            return this.LLILZLL.style == 4;
        }
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZLL;
        return ((((int) encourageGoLiveCard.lynxModuleUse) & 2) == 2) && (encourageGoLiveCard.lynxBgImg.length() > 0);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget
    public final boolean R1() {
        if (!G1()) {
            return this.LLILZLL.style == 1;
        }
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZLL;
        return ((((int) encourageGoLiveCard.lynxModuleUse) & 8) == 8) && (encourageGoLiveCard.lynxBgVideo.length() > 0);
    }

    public final void U1() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append(this.LLJJLIIIJLLLLLLLZ);
        C20441214yg.LIZIZ("LivePromoteLynxWidget", C2188811AlT.LIZIZ(sbLIZ));
        View view = this.LLJJJJLIIL;
        if (view != null) {
            C500260Jjc.LJIILIIL(view);
        }
        View view2 = this.LLJJJJLIIL;
        if (view2 != null) {
            view2.setOnTouchListener(null);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJJJJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        C1548820qPI.LJIIIIZZ("live_insert_lynx_card", this);
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZLL;
        C1537060q6K.LIZIZ(encourageGoLiveCard.templateSchema, encourageGoLiveCard.templateBizId, null);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        if (this.LLJJLIIIJLLLLLLLZ) {
            return;
        }
        U1();
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveNewStyleCardWidget, X.InterfaceC464250IIl
    public final void t0() throws JSONException {
        super.t0();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", "client_show");
        jSONObject.put("log_params", T1());
        C389001fE.LIZ("live_insert_lynx_card", jSONObject, System.currentTimeMillis(), false);
    }

    public LivePromoteLynxWidget(EncourageGoLiveCard encourageGoLiveCard) {
        super(encourageGoLiveCard);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget
    public final void M1(boolean z) {
        if (this.LLJJLIIIJLLLLLLLZ) {
            U1();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget
    public final void O1(View view) {
        Object c098200Yq;
        Object c098200Yq2;
        int iLIZJ;
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZLL;
        int i = encourageGoLiveCard.style;
        Object obj = null;
        if (i != 0 && i != 2) {
            if (i != 4) {
                try {
                    if (G1() && this.LLILZLL.lynxBgColor.length() > 0) {
                        iLIZJ = Color.parseColor(this.LLILZLL.lynxBgColor);
                    } else if (this.LLILZLL.videoBgColor.length() > 0) {
                        iLIZJ = Color.parseColor(this.LLILZLL.videoBgColor);
                    } else if (R1() || !Q1()) {
                        iLIZJ = C497740JfY.LIZJ(R.attr.exg);
                    } else {
                        iLIZJ = C497740JfY.LIZJ(R.attr.exg);
                    }
                    c098200Yq2 = Integer.valueOf(iLIZJ);
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq2 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                    obj = c098200Yq2;
                }
                Integer num = (Integer) obj;
                if (num != null) {
                    view.setBackgroundColor(num.intValue());
                    return;
                }
                return;
            }
            return;
        }
        try {
            c098200Yq = Integer.valueOf(Color.parseColor(encourageGoLiveCard.pictures.get(0).bgColor));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            view.setBackgroundColor(num2.intValue());
        }
    }

    public final void S1(SparkContext sparkContext) {
        String str = this.LLILLJJLI;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        sparkContext.LJJJZ("enter_from", str);
        String str3 = this.LLILZ;
        if (str3 != null) {
            str2 = str3;
        }
        sparkContext.LJJJZ("request_id", str2);
        sparkContext.LJJJZ("extra", C018Q.LIZ(LiveInnerWatchHistoryExtraCountSetting.INSTANCE.getValue()));
        sparkContext.LJJJZ("roma_enable_with_param", "1");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        String string;
        if (!Intrinsics.LJFF(c262100zr.LIZ, "live_insert_lynx_card") || (interfaceC1107590evd = c262100zr.LIZIZ) == null || (string = interfaceC1107590evd.getString("position")) == null) {
            return;
        }
        switch (string.hashCode()) {
            case -701740491:
                if (string.equals("not_interested")) {
                    A1();
                }
                break;
            case 192490979:
                string.equals("go_live");
                break;
            case 1071305029:
                if (string.equals("notify_later_v2")) {
                    C1();
                }
                break;
            case 1805476374:
                if (string.equals("notify_later")) {
                    B1();
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0foN, com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteLynxWidget, com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, com.bytedance.android.widget.Widget] */
    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, com.bytedance.android.widget.Widget
    public final void setContentView(View view) {
        FrameLayout frameLayout;
        ?? r0;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2;
        SparkContext sparkContext;
        SparkSchemaParam sparkSchemaParamLJJJI;
        super.setContentView(view);
        View viewFindViewById = null;
        if (view != null) {
            frameLayout = (FrameLayout) view.findViewById(R.id.h46);
        } else {
            frameLayout = null;
        }
        this.LLJJJJ = frameLayout;
        EncourageGoLiveCard encourageGoLiveCard = this.LLILZLL;
        String str = encourageGoLiveCard.templateSchema;
        Context context = this.context;
        if (context != null) {
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            C1051630dTN c1051630dTNLJI = C1537060q6K.LJI(encourageGoLiveCard.templateBizId);
            InterfaceC1105930esx interfaceC1105930esxLIZJ = C1537060q6K.LIZJ(context, str, this.LLILZLL.templateBizId);
            if (interfaceC1105930esxLIZJ != null && (c1051630dTNLJI == null || c1051630dTNLJI.LIZ() != 1 || !((C1097680efe) c1051630dTNLJI).LJJ || ((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) interfaceC1105930esxLIZJ).LLJLILLLLZIIL != EnumC1538460q8a.FAIL)) {
                if (interfaceC1105930esxLIZJ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) interfaceC1105930esxLIZJ;
                } else {
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = null;
                }
                this.LLJJJJJIL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                    sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getSparkContext();
                } else {
                    sparkContext = null;
                }
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = this.LLJJJJJIL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null) {
                    if (sparkContext != null) {
                        C1529880puk c1529880puk = SparkContext.Companion;
                        sparkSchemaParamLJJJI = sparkContext.LJJJI(-1);
                    } else {
                        sparkSchemaParamLJJJI = null;
                    }
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.LJJIJIIJIL(sparkContext, sparkSchemaParamLJJJI);
                }
                if (sparkContext != null) {
                    S1(sparkContext);
                    sparkContext.LJJJJZI(new C470030Ibx(this, true));
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 = this.LLJJJJJIL;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 != null) {
                        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.LJJIJL(sparkContext);
                    }
                }
            }
        }
        if (this.LLJJJJJIL == null) {
            this.LLJJJJJIL = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).Vn2(this.context, str, null, "INNTER_GO_LIVE_PROMOTE", true, new AwS621S0100000_7((LivePromoteLynxWidget) this, 73));
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5 = this.LLJJJJJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5 != null && C0J39.LIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5) && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJJJJIL) != null) {
            C0J39.LIZIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        try {
            FrameLayout frameLayout2 = this.LLJJJJ;
            if (frameLayout2 != null) {
                frameLayout2.addView(this.LLJJJJJIL, -1, -1);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (view != null) {
            O1(view);
            C1324720kZq c1324720kZq = (C1324720kZq) view.findViewById(R.id.lcz);
            if (c1324720kZq != null && Q1()) {
                if (G1()) {
                    C786410Ut5.LLJJIII(c1324720kZq, 0);
                    H1(this.LLILZLL.lynxBgImg, c1324720kZq, null);
                } else {
                    C786410Ut5.LLJJIII(c1324720kZq, 0);
                    H1(this.LLILZLL.bgImgUrl, c1324720kZq, null);
                }
            }
        }
        C1548820qPI.LIZLLL("live_insert_lynx_card", this);
        if (R1() && view != null) {
            View viewFindViewById2 = view.findViewById(R.id.ern);
            if (viewFindViewById2 != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            }
            TextureView textureView = (TextureView) view.findViewById(R.id.video_bg);
            if (textureView != null) {
                IHostWatch iHostWatch = (IHostWatch) C1161920gLG.LIZJ(IHostWatch.class);
                EncourageGoLiveCard encourageGoLiveCard2 = this.LLILZLL;
                viewFindViewById = null;
                this.LLJILLL = iHostWatch.getVideoCleanPlayerController(textureView, encourageGoLiveCard2.videoUrl, encourageGoLiveCard2.videoLength, null, "extra card", null);
            }
        }
        if (P1()) {
            if (view != null) {
                r0 = (FrameLayout) view.findViewById(R.id.ci6);
            } else {
                r0 = viewFindViewById;
            }
            this.LLJILJIL = r0;
        }
        if (LiveHostBackToInnerSetting.INSTANCE.enableAutoDraw()) {
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.nuj);
            }
            this.LLJJJJLIIL = viewFindViewById;
        }
    }
}
