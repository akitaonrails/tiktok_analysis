package com.ss.android.ugc.aweme.detail.ui;

import X.AbstractC1563340qmi;
import X.C0AAN;
import X.C0OGM;
import X.C0QTN;
import X.C0S4J;
import X.C0VPL;
import X.C0Z6E;
import X.C14EU;
import X.C1606370ru7;
import X.C1606420ruC;
import X.C1606640ruY;
import X.C1607950rwf;
import X.C1757030vp7;
import X.C1888107aR;
import X.C199Y;
import X.C20508081q;
import X.C20629915o1;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C294700Bgq;
import X.C484220Iyq;
import X.C581630MrZ;
import X.C686870Qwv;
import X.C737030Svd;
import X.C786410Ut5;
import X.C913020Zro;
import X.C913060Zrs;
import X.EnumC682280QpW;
import X.InterfaceC1058480deQ;
import X.InterfaceC1209250hZb;
import X.InterfaceC1218550hob;
import X.InterfaceC1399350mWD;
import X.InterfaceC1740760vOs;
import X.InterfaceC20573715ex;
import X.InterfaceC214902198i;
import X.InterfaceC342470Dbh;
import X.InterfaceC530790Krl;
import X.InterfaceC836750Ws5;
import Y.AObjectS398S0100000_24;
import Y.ARunnableS15S1000000_24;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.transition.Fade;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.SAFContextThemeConfig;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* JADX INFO: loaded from: classes25.dex */
public class DetailActivity extends C199Y implements InterfaceC1218550hob, InterfaceC530790Krl, InterfaceC1058480deQ, InterfaceC836750Ws5, InterfaceC1740760vOs, InterfaceC20573715ex, C0OGM {
    public static final HashSet<Integer> LLILZIL = new HashSet<>();
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiHELIOSEpPS46JGs5IGEXLTEtICMSKzElPyYnMQ==";
    public volatile boolean LL;
    public DetailSafRootFragment LLILLJJLI;
    public boolean LLILLL;
    public C686870Qwv LLILZ;

    public void LLLLZI() {
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void getAgeInfoUpdateEvent(C0Z6E c0z6e) {
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean getEnableSAF() {
        return true;
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean migrateDarkModeImplToFragment() {
        return true;
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean migrateImmersiveBarImplToFragment() {
        return true;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onStart", false);
    }

    @C14EU
    public void onVideoEvent(C737030Svd c737030Svd) {
    }

    @C14EU
    public void onVideoPlayerEvent(C581630MrZ c581630MrZ) {
    }

    public final DetailSafRootFragment LLLLZIL() {
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = (DetailSafRootFragment) C20629915o1.LIZ(this);
        }
        return this.LLILLJJLI;
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        final String stringExtra;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onResume", true);
        try {
            stringExtra = getIntent().getStringExtra(FollowStatusChangeMethod.PARAM_UID);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        if (this.LLILLL) {
            C913020Zro c913020Zro = C913060Zrs.LIZ;
            if (TextUtils.equals(stringExtra, c913020Zro != null ? c913020Zro.LIZ : null)) {
                this.LLILLL = false;
                C786410Ut5.v2().postFrameCallback(new Choreographer.FrameCallback() { // from class: X.0ru4
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j) {
                        C913020Zro c913020Zro2;
                        String str = stringExtra;
                        String str2 = DetailActivity._pnsPageId;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (str != null && (c913020Zro2 = C913060Zrs.LIZ) != null && Intrinsics.LJFF(c913020Zro2.LIZ, str) && c913020Zro2.LJIIZILJ <= 0) {
                            c913020Zro2.LJIIZILJ = jCurrentTimeMillis;
                        }
                    }
                });
                C20508081q.LIZ(C786410Ut5.v2(), new ARunnableS15S1000000_24(stringExtra, 4));
            }
        }
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onResume", false);
    }

    public DetailActivity() {
        new C0S4J("DetailActivity");
        this.LL = false;
        this.LLILLJJLI = null;
        this.LLILLL = true;
    }

    @Override // X.InterfaceC1058480deQ
    public final DetailPageFragment Bc() {
        if (LLLLZIL() != null) {
            return LLLLZIL().Bc();
        }
        return null;
    }

    @Override // X.InterfaceC20573715ex
    public final void E4() {
        if (LLLLZIL() != null) {
            LLLLZIL().getClass();
        }
    }

    @Override // X.InterfaceC20573715ex
    public final boolean K6() {
        if (LLLLZIL() != null) {
            LLLLZIL().getClass();
        }
        return true;
    }

    @Override // X.C199Y
    public final AbstractC1563340qmi createSafLifecycleRegistry() {
        return C294700Bgq.LIZ() ? new AbstractC1563340qmi(this) { // from class: X.0ruB
            @Override // X.AbstractC1563340qmi
            public final String LJ() {
                return "DetailFeedSAFPrefixId";
            }

            @Override // X.AbstractC1563340qmi, X.InterfaceC1563360qmk
            public final boolean LIZIZ() {
                return C1606370ru7.LIZJ(this.LLILZIL);
            }

            @Override // X.AbstractC1563340qmi
            public final boolean LJII() {
                return C1606370ru7.LIZJ(this.LLILZIL);
            }
        } : super.createSafLifecycleRegistry();
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ab, code lost:
    
        if (r4.xN(true) == true) goto L50;
     */
    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void finish() {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.DetailActivity.finish():void");
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return LLLLZIL() != null ? LLLLZIL().getBtmPageCode() : "b2878";
    }

    @Override // X.C199Y
    public final boolean getEnableNavigation() {
        return C1606370ru7.LIZJ(this);
    }

    @Override // X.InterfaceC1218550hob
    public final InterfaceC1209250hZb getHelper() {
        if (LLLLZIL() != null) {
            return LLLLZIL().getHelper();
        }
        return null;
    }

    @Override // X.InterfaceC530790Krl
    public final C0QTN getInflater() {
        if (LLLLZIL() == null) {
            if (this.LLILZ == null) {
                this.LLILZ = new C686870Qwv(this);
            }
            return this.LLILZ;
        }
        DetailSafRootFragment detailSafRootFragmentLLLLZIL = LLLLZIL();
        C686870Qwv c686870Qwv = detailSafRootFragmentLLLLZIL.LLLIIIL;
        if (c686870Qwv != null) {
            return c686870Qwv;
        }
        C686870Qwv c686870Qwv2 = new C686870Qwv(detailSafRootFragmentLLLLZIL.requireActivity());
        detailSafRootFragmentLLLLZIL.LLLIIIL = c686870Qwv2;
        return c686870Qwv2;
    }

    @Override // X.C0OGM
    public int getPageType() {
        if (LLLLZIL() != null) {
            LLLLZIL().getClass();
        }
        return -1;
    }

    @Override // X.C199Y
    public Function0<InterfaceC214902198i> getRootFragmentFactory() {
        DetailSafRootFragment detailSafRootFragment;
        if (C1606370ru7.LIZJ(this)) {
            detailSafRootFragment = new DetailSafRootFragment();
            detailSafRootFragment.aS(AFwS264S0000000_24.get$arr$(610));
        } else {
            detailSafRootFragment = new DetailSafRootFragment();
        }
        return new AObjectS398S0100000_24(detailSafRootFragment, 8);
    }

    @Override // X.C199Y
    public final SAFContextThemeConfig getRootPageContextConfig() {
        if (C1606370ru7.LIZJ(this)) {
            return new SAFContextThemeConfig(true, 0);
        }
        return null;
    }

    @Override // X.C199Y, X.InterfaceC214897198d
    public final boolean isDelegateFragmentManager() {
        return C1606370ru7.LIZJ(this);
    }

    @Override // X.C199Y, X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        boolean zLJI = MethodIDManager.LJI(71931);
        super.onBackPressed();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LLLLZI();
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        if (LLLLZIL() != null) {
            return LLLLZIL().r9();
        }
        return null;
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return LLLLZIL() != null ? LLLLZIL().w3() : String.valueOf(hashCode());
    }

    @Override // X.InterfaceC20573715ex
    public final boolean wy() {
        if (LLLLZIL() != null) {
            LLLLZIL().getClass();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void finishAfterTransition() {
        super.finishAfterTransition();
    }

    @Override // X.C199Y
    public Class<? extends InterfaceC214902198i> getRootFragmentClz() {
        return DetailSafRootFragment.class;
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    public static C1606420ruC LLLLLZL(View view) {
        C1606640ruY c1606640ruY = C1606640ruY.LIZ;
        c1606640ruY.getClass();
        if (C1606640ruY.LIZ().animType == 2) {
            c1606640ruY.getClass();
            if (C1606640ruY.LIZ().animStartFrom == 1) {
                return C1607950rwf.LIZJ(view, view.getResources().getDisplayMetrics().widthPixels / 2, view.getResources().getDisplayMetrics().heightPixels / 2, 0, 0);
            }
            return C1607950rwf.LIZJ(view, view.getWidth() / 2, view.getHeight() / 2, view.getWidth(), view.getHeight());
        }
        return new C1606420ruC(ActivityOptions.makeBasic());
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19FO, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        if (C294700Bgq.LIZ()) {
            Lifecycle lifecycle = getLifecycle();
            if (lifecycle instanceof AbstractC1563340qmi) {
                AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) lifecycle;
                abstractC1563340qmi.LIZLLL(EnumC682280QpW.MAIN.getValue() | EnumC682280QpW.FINISH.getValue() | EnumC682280QpW.IS_FINISHING.getValue() | EnumC682280QpW.IS_DESTROY.getValue());
                abstractC1563340qmi.LIZLLL(EnumC682280QpW.GET_CURRENT_STATE.getValue() | EnumC682280QpW.LIVEDATA_OBSERVE.getValue() | EnumC682280QpW.VSCOPE_ATTACH.getValue());
                abstractC1563340qmi.LIZLLL(EnumC682280QpW.VIEWMODEL_STORE.getValue());
            }
        }
    }

    @Override // X.C199Y, X.C19GS, X.C19FO, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // X.C199Y, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.C19GS, android.app.Activity
    public final <T extends View> T findViewById(int i) {
        T t = (T) super.findViewById(i);
        if (t == null && LLILZIL.contains(Integer.valueOf(i))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("findViewById is null and id is ");
            sbLIZ.append(i);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("live_fragment_id", C2188811AlT.LIZIZ(sbLIZ));
            return (T) super.findViewById(R.id.ykw);
        }
        return t;
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) throws JSONException {
        String stringExtra;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onCreate", true);
        if (getIntent().getBooleanExtra("im_chat_to_detail_saf", false) && C1606640ruY.LIZJ()) {
            getWindow().setBackgroundDrawable(new ColorDrawable(-16777216));
        }
        try {
            stringExtra = getIntent().getStringExtra("video_from");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        if (Intrinsics.LJFF(stringExtra, "from_friends_v3_feed") && !(!C1888107aR.LIZ())) {
            getWindow().requestFeature(12);
            getWindow().setSharedElementEnterTransition(C1757030vp7.LIZIZ(true));
            getWindow().setSharedElementReturnTransition(C1757030vp7.LIZIZ(false));
            Window window = getWindow();
            Fade fade = new Fade();
            fade.setDuration(0L);
            fade.setInterpolator(C1757030vp7.LIZ(true, false));
            window.setEnterTransition(fade);
            Window window2 = getWindow();
            Fade fade2 = new Fade();
            fade2.setDuration(0L);
            fade2.setInterpolator(C1757030vp7.LIZ(false, false));
            window2.setReturnTransition(fade2);
            getWindow().setSharedElementsUseOverlay(false);
            postponeEnterTransition();
        }
        int iIntValue = ((Number) C0AAN.LIZ.getValue()).intValue();
        if (iIntValue > 0) {
            new Object() { // from class: X.0ruI
            }.getClass();
            Intent intent = getIntent();
            if (intent != null && (intent.hasExtra("conversation_id") || intent.hasExtra("message_id") || intent.hasExtra("chatroom_session_uuid") || intent.hasExtra("message") || intent.hasExtra("channel_id") || intent.hasExtra("show_reply_panel") || intent.hasExtra("chat_type_str") || intent.hasExtra("key_im_aweme_open_from"))) {
                C20684815ws.LJIILLIIL("detail_open_delay_applied", C2097608Jq.LJIIIIZZ(new Pair("delay_ms", String.valueOf(iIntValue)), new Pair(Scene.SCENE_SERVICE, "im")));
                SystemClock.sleep(iIntValue);
            }
        }
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onCreate", false);
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC655270Pn3
    public final void registerActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        if (LLLLZIL() != null && interfaceC1399350mWD != null) {
            LLLLZIL().registerActivityOnKeyDownListener(interfaceC1399350mWD);
        }
    }

    @Override // X.InterfaceC836750Ws5
    public final void setActivityResultListener(InterfaceC342470Dbh interfaceC342470Dbh) {
        if (LLLLZIL() != null) {
            LLLLZIL().LLJJIJIL = interfaceC342470Dbh;
        }
    }

    @Override // X.InterfaceC655270Pn3
    public final void unRegisterActivityOnKeyDownListener(InterfaceC1399350mWD interfaceC1399350mWD) {
        if (LLLLZIL() != null && interfaceC1399350mWD != null) {
            LLLLZIL().unRegisterActivityOnKeyDownListener(interfaceC1399350mWD);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, android.app.Activity
    public final void onActivityReenter(int i, Intent intent) {
        String stringExtra;
        C0VPL.LIZ(i, this);
        if (-1 == i && intent != null && getHelper() != null) {
            InterfaceC1209250hZb helper = getHelper();
            try {
                stringExtra = intent.getStringExtra("feed_share_element_aid");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            helper.As(stringExtra);
        }
        super.onActivityReenter(i, intent);
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19GS, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.C199Y, X.ActivityC21503719Dn, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    @Override // X.C199Y, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
