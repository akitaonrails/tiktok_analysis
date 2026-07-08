package com.bytedance.android.livesdk.rank.impl.widget;

import X.AbstractC1086230eNB;
import X.AbstractViewOnClickListenerC1105820esm;
import X.AnonymousClass0126;
import X.C001A;
import X.C011Z;
import X.C01GW;
import X.C01P8;
import X.C01VD;
import X.C01VF;
import X.C0IJT;
import X.C0IZP;
import X.C0J1N;
import X.C0JT6;
import X.C0KVO;
import X.C0TZM;
import X.C1082780eHc;
import X.C1082820eHg;
import X.C1082850eHj;
import X.C1082890eHn;
import X.C1085120eLO;
import X.C1086100eMy;
import X.C1086260eNE;
import X.C1086270eNF;
import X.C1091770eW7;
import X.C1105310erx;
import X.C1105320ery;
import X.C1105330erz;
import X.C1105340es0;
import X.C1105360es2;
import X.C1105460esC;
import X.C1105600esQ;
import X.C1119850fFP;
import X.C1151790g4v;
import X.C1151830g4z;
import X.C1161920gLG;
import X.C11NZ;
import X.C11RD;
import X.C11S5;
import X.C13LQ;
import X.C148100hT;
import X.C14KS;
import X.C1548820qPI;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1810700xDg;
import X.C1834150xpV;
import X.C1850730yGF;
import X.C19ME;
import X.C20337914i1;
import X.C20441214yg;
import X.C20736316Cj;
import X.C2097608Jq;
import X.C2252321DDq;
import X.C23250099c;
import X.C235200vW;
import X.C251600yA;
import X.C452501pT;
import X.C464360IIw;
import X.C474500IjA;
import X.C475530Ikp;
import X.C497680JfS;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501590Jll;
import X.C516201zk;
import X.C635860Owq;
import X.C751340Tdc;
import X.C753960Thq;
import X.C776250Uch;
import X.C780920UkE;
import X.C783600UoY;
import X.C784440Upu;
import X.C786410Ut5;
import X.C823050WQl;
import X.EnumC187400no;
import X.InterfaceC1086210eN9;
import X.InterfaceC1088670eR7;
import X.InterfaceC1105450esB;
import X.InterfaceC1106030et7;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnLayoutChangeListenerC1151590g4b;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS18S0210000_17;
import Y.AUListenerS253S0100000_2;
import Y.AfS181S0100000_12;
import Y.AfS186S0100000_17;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.ChangeNameWidth;
import com.bytedance.android.live.ChangeOnlineRankWidth;
import com.bytedance.android.live.UserContainerWidgetChangeEvent;
import com.bytedance.android.live.base.model.roomcomponents.OnlineRankListResponse;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.GameFloatingWindowAudienceClickEvent;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget;
import com.bytedance.android.live.setting.LiveMainFrameUpdateFontOptSetting;
import com.bytedance.android.livesdk.dataChannel.LopUnlockEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.LiveMainFrameworkFixSetting;
import com.bytedance.android.livesdk.livesetting.LiveMainFrameworkUpdateReduceMeasureSetting;
import com.bytedance.android.livesdk.livesetting.LiveMainFrameworkUpdateTopOneLineCheckLogReportSetting;
import com.bytedance.android.livesdk.livesetting.LiveMainFrameworkUpdateTopOneLineSizeConfigSetting;
import com.bytedance.android.livesdk.livesetting.LiveOnlineRankClearScreenOptSetting;
import com.bytedance.android.livesdk.livesetting.LiveOnlineRankOnWidthChangeOptSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveU18HiddenCountSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutRenderingScopeOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.rank.AudienceListPromoteAwarenessTypeSetting;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceGeckoSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.mainframework.LiveMainFrameworkExpandOnlineSetting;
import com.bytedance.android.livesdk.model.FlareInfo;
import com.bytedance.android.livesdk.rank.api.CloseAudienceRankingEvent;
import com.bytedance.android.livesdk.rank.api.OpenAudienceRankingEvent;
import com.bytedance.android.livesdk.rank.api.OpenAudienceRankingWithParamsEvent;
import com.bytedance.android.livesdk.rank.api.model.Rank;
import com.bytedance.android.livesdk.rank.impl.AudienceRankSettingEvent;
import com.bytedance.android.livesdk.rank.impl.CloseAudienceRankDialogEvent;
import com.bytedance.android.livesdk.rank.impl.viewmodel.AudienceRankingEntranceViewModel;
import com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.EcomRankInfo;
import com.bytedance.android.livesdkapi.depend.model.live.OnlineAudience;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class OnlineAudienceRankWidget extends RoomRecycleFunctionWidget implements InterfaceC1105450esB, InterfaceC1088670eR7 {
    public static final /* synthetic */ int LLJLLIL = 0;
    public AudienceRankingEntranceViewModel LLILLL;
    public C1105320ery LLILZ;
    public FrameLayout LLIZ;
    public boolean LLIZLLLIL;
    public int LLJI;
    public ImageView LLJIJIL;
    public ARunnableS112S0100000_12 LLJILJIL;
    public ARunnableS112S0100000_12 LLJILJILJ;
    public Room LLJILLL;
    public SparkContext LLJJ;
    public C1105340es0 LLJJIJI;
    public AbstractC1086230eNB LLJJIJIIJIL;
    public C251600yA LLJJIJIL;
    public boolean LLJJJ;
    public float LLJJJIL;
    public boolean LLJJJJ;
    public int LLJJJJJIL;
    public String LLJJJJLIIL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public boolean LLJLIL;
    public List<C1105460esC> LLJLILLLLZIIL;
    public final float LLILLJJLI = 20.0f;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 234));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 233));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 231));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS561S0100000_17(this, 232));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS561S0100000_17(this, 235));
    public boolean LLJJL = true;
    public final C1151790g4v LLJLL = new C1151790g4v(this, 3);

    @Override // X.InterfaceC1088670eR7
    public final List<View> LJJJZ() {
        return C13LQ.LJIJI(new View[]{A1(), C1()});
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.h8x;
    }

    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C19ME c19me;
        C19ME c19me2;
        IMessageManager iMessageManager;
        IMessageManager iMessageManager2;
        this.LL = false;
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Yd2()) {
            this.dataChannel.zW(ChangeNameWidth.class, -1);
        }
        AudienceRankingEntranceViewModel audienceRankingEntranceViewModel = this.LLILLL;
        if (audienceRankingEntranceViewModel != null) {
            C20441214yg.LIZIZ("AudienceRankingEntranceViewModel", "release");
            audienceRankingEntranceViewModel.LL.release();
            C01P8 c01p8 = audienceRankingEntranceViewModel.LLILZIL;
            c01p8.getClass();
            C20441214yg.LIZIZ("AudienceRankingMessageListener", "release");
            DataChannel dataChannel = c01p8.LL;
            if (dataChannel != null && (iMessageManager2 = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
                iMessageManager2.removeMessageListener((OnIMMessageListener) c01p8);
            }
        }
        this.LLILLL = null;
        C1105320ery c1105320ery = this.LLILZ;
        if (c1105320ery != null) {
            c1105320ery.LJFF();
        }
        this.LLJJ = null;
        this.LLILZ = null;
        C500260Jjc.LLFFF(z1());
        this.LLJI = 0;
        this.LLJJJIL = 0.0f;
        this.LLJJJ = false;
        this.LLIZLLLIL = false;
        this.LLJJIJI = null;
        C497680JfS.LIZIZ = -1L;
        C1548820qPI.LJIIIIZZ("ttlive_flare_viewers_list", this.LLJLL);
        C1548820qPI.LJIIIIZZ("audience_ranking_pop_event", this.LLJLL);
        C1548820qPI.LJIIIIZZ("audience_ranking_data", this.LLJLL);
        View view = getView();
        if (view != null) {
            HandlerHook.viewRemoveCallbacks(view, this.LLJILJIL);
            HandlerHook.viewRemoveCallbacks(view, this.LLJILJILJ);
        }
        AbstractC1086230eNB abstractC1086230eNB = this.LLJJIJIIJIL;
        if (abstractC1086230eNB != null) {
            abstractC1086230eNB.onDestroy();
        }
        C251600yA c251600yA = this.LLJJIJIL;
        if (c251600yA != null) {
            c251600yA.LLILZ = false;
            c251600yA.LLILZIL = false;
            c251600yA.LLIZLLLIL.removeCallbacks(c251600yA.LLIZ);
            DataChannel dataChannel2 = c251600yA.LL;
            if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.gg0(C776250Uch.class)) != null) {
                iMessageManager.removeMessageListener(c251600yA);
            }
            c251600yA.LLILLL.LJ();
        }
        this.LLJJJJLIIL = null;
        H1(0);
        ViewGroup.LayoutParams layoutParams = C1().getLayoutParams();
        if ((layoutParams instanceof C19ME) && (c19me2 = (C19ME) layoutParams) != null) {
            c19me2.matchConstraintMinWidth = (int) C497740JfY.LIZIZ(0.0f);
            C786410Ut5.W5(C1(), c19me2);
        }
        View viewFindViewById = findViewById(R.id.pmt);
        ViewGroup.LayoutParams layoutParams2 = (viewFindViewById == null && (viewFindViewById = this.LLIZ) == null) ? null : viewFindViewById.getLayoutParams();
        if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null) {
            c19me.matchConstraintMinWidth = (int) C497740JfY.LIZIZ(0.0f);
            C786410Ut5.W5(viewFindViewById, c19me);
        }
        x1(viewFindViewById, Float.valueOf(2.0f));
    }

    static {
        C497740JfY.LIZ(32.0f);
        C497740JfY.LIZ(32.0f);
        C497740JfY.LIZ(20.0f);
        C497740JfY.LIZ(12.0f);
    }

    public final LinearLayout A1() {
        return (LinearLayout) this.LLJJI.getValue();
    }

    public final C1105310erx B1() {
        return (C1105310erx) this.LLILZLL.getValue();
    }

    public final View C1() {
        return (View) this.LLILZIL.getValue();
    }

    public final boolean D1() {
        IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
        if (iRoomFunctionService != null) {
            return iRoomFunctionService.Tt1(this.dataChannel);
        }
        return false;
    }

    public final boolean E1() {
        DataChannel dataChannel;
        C0KVO c0kvo;
        if (!LiveOnlineRankClearScreenOptSetting.INSTANCE.enable()) {
            return false;
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (((dataChannel2 == null || (c0kvo = (C0KVO) dataChannel2.gg0(C1082820eHg.class)) == null) ? null : c0kvo.LIZJ) instanceof C475530Ikp) {
            return false;
        }
        DataChannel dataChannel3 = this.dataChannel;
        return (dataChannel3 != null && Intrinsics.LJFF(dataChannel3.gg0(C1082780eHc.class), Boolean.TRUE)) || ((dataChannel = this.dataChannel) != null && Intrinsics.LJFF(dataChannel.gg0(C753960Thq.class), Boolean.TRUE));
    }

    public final void I1() {
        if (((int) C497740JfY.LIZIZ(320.0f)) < C497740JfY.LJIIZILJ() || this.LLJJJJ) {
            C786410Ut5.LLJJIJIL(z1(), 0);
            return;
        }
        C786410Ut5.LLJJIJIL(z1(), 8);
        View viewFindViewById = findViewById(R.id.pmt);
        if (viewFindViewById == null) {
            viewFindViewById = this.LLIZ;
        }
        x1(viewFindViewById, Float.valueOf(8.0f));
        B1().setGravity(17);
    }

    @Override // X.InterfaceC1105450esB
    public final void LJJLIIIJJI() {
        try {
            if (!this.isViewValid) {
                throw new IllegalStateException("Check failed.");
            }
            LinearLayout linearLayoutA1 = A1();
            if (linearLayoutA1 != null) {
                C786410Ut5.LJZL(8, linearLayoutA1);
            }
            C1105330erz.LIZJ(0, this.dataChannel, false);
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC1088670eR7
    public final int LLLLLLLZIL() {
        OnlineRankListResponse onlineRankListResponse;
        List<Rank> list;
        C2252321DDq c2252321DDq;
        AudienceRankingEntranceViewModel audienceRankingEntranceViewModel = this.LLILLL;
        C148100hT c148100hT = null;
        if (audienceRankingEntranceViewModel != null && (c2252321DDq = audienceRankingEntranceViewModel.LLIZ) != null) {
            c148100hT = (C148100hT) c2252321DDq.getValue();
        }
        if (!(c148100hT instanceof C148100hT) || c148100hT == null || (onlineRankListResponse = c148100hT.LIZ) == null || (list = onlineRankListResponse.ranks) == null) {
            return 0;
        }
        return list.size();
    }

    @Override // X.InterfaceC1105450esB
    public final void T() {
        try {
            if (!this.isViewValid) {
                throw new IllegalStateException("Check failed.");
            }
            H1(0);
            B1().setText(CardStruct.IStatusCode.DEFAULT);
            C786410Ut5.LJLLLLLL(8, C1());
            LinearLayout linearLayoutA1 = A1();
            if (linearLayoutA1 != null) {
                C786410Ut5.LJZL(8, linearLayoutA1);
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y1() {
        /*
            r6 = this;
            android.content.Context r1 = r6.context
            r2 = 0
            if (r1 != 0) goto Lf
            android.view.View r0 = r6.C1()
            if (r0 == 0) goto L62
            android.content.Context r1 = r0.getContext()
        Lf:
            int r0 = r6.LLJJJJJIL
            if (r0 < 0) goto L4e
            boolean r0 = r6.LLJJL
            if (r0 == 0) goto L4e
            if (r1 == 0) goto L4e
            android.view.View r5 = r6.C1()
            if (r5 == 0) goto L4a
            android.content.res.Resources r4 = r1.getResources()
            if (r4 == 0) goto L4b
            int r1 = r6.LLJJJJJIL
            r3 = 1000000(0xf4240, float:1.401298E-39)
            if (r1 > r3) goto L2d
            r3 = r1
        L2d:
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            long r0 = (long) r1
            java.lang.String r1 = X.C1850730yGF.LIZJ(r0)
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toUpperCase(r0)
            r0 = 0
            r2[r0] = r1
            r0 = 2131755590(0x7f100246, float:1.9142064E38)
            java.lang.String r0 = r4.getQuantityString(r0, r3, r2)
            if (r0 == 0) goto L4b
        L47:
            r5.setContentDescription(r0)
        L4a:
            return
        L4b:
            java.lang.String r0 = ""
            goto L47
        L4e:
            android.view.View r1 = r6.C1()
            if (r1 == 0) goto L4a
            X.0erx r0 = r6.B1()
            if (r0 == 0) goto L5e
            java.lang.CharSequence r2 = r0.getText()
        L5e:
            r1.setContentDescription(r2)
            return
        L62:
            r1 = r2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget.y1():void");
    }

    public final LiveIconView z1() {
        return (LiveIconView) this.LLJ.getValue();
    }

    @Override // X.InterfaceC1088670eR7
    public final View LJJJJLI() {
        return C1();
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, X.InterfaceC1078250eAJ
    public final void LJLIL() {
        if (D1()) {
            C0IZP.LIZLLL("watch_cnt", this.LLJILLL, Long.valueOf(this.LLJL));
            C0IZP.LIZLLL("audience_avatar", this.LLJILLL, Long.valueOf(this.LLJL));
        }
    }

    @Override // X.InterfaceC1105450esB
    public final void LLLLII() {
        Room room;
        LinearLayout linearLayoutA1 = A1();
        if ((linearLayoutA1 == null || linearLayoutA1.getVisibility() != 0) && !this.LLJJJ) {
            LinearLayout linearLayoutA12 = A1();
            if (linearLayoutA12 != null) {
                C786410Ut5.LJZL(0, linearLayoutA12);
            }
            if (this.LLJLIL) {
                return;
            }
            this.LLJLIL = true;
            if (D1() || (room = this.LLJILLL) == null) {
                return;
            }
            C0IZP.LIZJ(room, "audience_avatar");
        }
    }

    @Override // X.InterfaceC1088670eR7
    public final ViewGroup LLLLLLL() {
        View view = getView();
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // X.InterfaceC1088670eR7
    public final ViewGroup LLLLLZ() {
        View view = getView();
        ViewParent parent = view != null ? view.getParent() : null;
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, X.InterfaceC1078250eAJ
    public final void X0() {
        if (D1()) {
            this.LLJL = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        C1105320ery c1105320ery = this.LLILZ;
        if (c1105320ery != null) {
            c1105320ery.onResume();
        }
    }

    @Override // X.InterfaceC1105450esB
    public final AudienceRankingEntranceViewModel getViewModel() {
        return this.LLILLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0456 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29, types: [int] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G1(java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 1677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget.G1(java.lang.String):void");
    }

    public final void H1(int i) {
        if (this.LLJJJJJIL != i) {
            this.LLJJJJJIL = i;
            y1();
        }
    }

    @Override // X.InterfaceC1105450esB
    public final void S(int i) {
        C19ME c19me;
        C19ME c19me2;
        C19ME c19me3;
        C19ME c19me4;
        if (this.LLJJJ) {
            return;
        }
        View viewFindViewById = findViewById(R.id.pmt);
        if (viewFindViewById == null) {
            viewFindViewById = this.LLIZ;
        }
        ViewGroup.LayoutParams layoutParams = null;
        if (i > 0) {
            LLLLII();
            C500260Jjc.LJIILIIL(z1());
            ViewGroup.LayoutParams layoutParams2 = C1().getLayoutParams();
            if ((layoutParams2 instanceof C19ME) && (c19me4 = (C19ME) layoutParams2) != null) {
                c19me4.matchConstraintMinWidth = (int) C497740JfY.LIZIZ(38.0f);
                C786410Ut5.W5(C1(), c19me4);
            }
            if (viewFindViewById != null) {
                layoutParams = viewFindViewById.getLayoutParams();
            }
            if ((layoutParams instanceof C19ME) && (c19me3 = (C19ME) layoutParams) != null) {
                c19me3.matchConstraintMinWidth = (int) C497740JfY.LIZIZ(14.0f);
                C786410Ut5.W5(viewFindViewById, c19me3);
            }
            x1(viewFindViewById, Float.valueOf(8.0f));
            B1().setGravity(17);
            return;
        }
        LJJLIIIJJI();
        ViewGroup.LayoutParams layoutParams3 = C1().getLayoutParams();
        if (layoutParams3 instanceof C19ME) {
            c19me = (C19ME) layoutParams3;
        } else {
            c19me = null;
        }
        if (c19me != null) {
            c19me.matchConstraintMinWidth = (int) C497740JfY.LIZIZ(0.0f);
            C786410Ut5.W5(C1(), c19me);
        }
        if (viewFindViewById != null) {
            layoutParams = viewFindViewById.getLayoutParams();
        }
        if ((layoutParams instanceof C19ME) && (c19me2 = (C19ME) layoutParams) != null) {
            c19me2.matchConstraintMinWidth = (int) C497740JfY.LIZIZ(0.0f);
            C786410Ut5.W5(viewFindViewById, c19me2);
        }
        x1(viewFindViewById, Float.valueOf(2.0f));
        I1();
    }

    @Override // X.InterfaceC1105450esB
    public final void b0(final int i) {
        FlareInfo flareInfo;
        long jLongValue;
        boolean z;
        String upperCase;
        Long l;
        try {
            if (isViewValid()) {
                C786410Ut5.LJLLLLLL(0, C1());
                AbstractC1086230eNB abstractC1086230eNB = this.LLJJIJIIJIL;
                String string = null;
                if (abstractC1086230eNB != null) {
                    final AwS596S0100000_17 awS596S0100000_17 = new AwS596S0100000_17(this, 230);
                    DataChannel dataChannel = abstractC1086230eNB.LLJJIJIIJIL;
                    if (dataChannel != null) {
                        flareInfo = (FlareInfo) dataChannel.gg0(C1082890eHn.class);
                    } else {
                        flareInfo = null;
                    }
                    C20337914i1<Long> c20337914i1 = InterfaceC1106030et7.r4;
                    Long lLIZIZ = c20337914i1.LIZIZ();
                    DataChannel dataChannel2 = abstractC1086230eNB.LLJJIJIIJIL;
                    if (dataChannel2 != null && (l = (Long) dataChannel2.gg0(C751340Tdc.class)) != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    if (lLIZIZ != null && lLIZIZ.longValue() == jLongValue) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (flareInfo != null && flareInfo.isFlare && !z) {
                        if (abstractC1086230eNB.LLJILJIL == 0) {
                            abstractC1086230eNB.LLJILJIL = System.currentTimeMillis();
                            TextView textView = abstractC1086230eNB.LLJI;
                            if (textView != null) {
                                textView.setText(C497740JfY.LJIJI(2131841691));
                            }
                            awS596S0100000_17.invoke(-1);
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_flare_lablel_show");
                            c474500IjALIZ.LJIJJLI(abstractC1086230eNB.LLJJIJIIJIL);
                            c474500IjALIZ.LIZ();
                            return;
                        }
                        if (System.currentTimeMillis() - abstractC1086230eNB.LLJILJIL <= Mp4ScreenVideoLoadTimeout.CONTROL) {
                            return;
                        }
                        final TextView textView2 = abstractC1086230eNB.LLJI;
                        if (textView2 != null) {
                            ValueAnimator duration = ValueAnimator.ofInt(textView2.getWidth(), (int) textView2.getPaint().measureText(C1850730yGF.LIZJ(i).toUpperCase(Locale.ENGLISH))).setDuration(300L);
                            duration.addUpdateListener(new AUListenerS253S0100000_2(textView2, 17));
                            duration.addListener(new Animator.AnimatorListener() { // from class: X.0Iip
                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationCancel(Animator animator) {
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationRepeat(Animator animator) {
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                                    if (layoutParams != null) {
                                        layoutParams.width = -2;
                                    }
                                    awS596S0100000_17.invoke(Integer.valueOf(i));
                                    textView2.setText(C1850730yGF.LIZJ(i).toUpperCase(Locale.ENGLISH));
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animator) {
                                    awS596S0100000_17.invoke(Integer.valueOf(i));
                                    textView2.setText(C1850730yGF.LIZJ(i).toUpperCase(Locale.ENGLISH));
                                }
                            });
                            duration.setInterpolator(abstractC1086230eNB.LIZLLL());
                            duration.start();
                        }
                        c20337914i1.LJFF(Long.valueOf(jLongValue));
                        return;
                    }
                    if (!this.LLJJL) {
                        upperCase = C497740JfY.LJIJI(2131844654);
                    } else {
                        upperCase = C1850730yGF.LIZJ(i).toUpperCase(Locale.ENGLISH);
                    }
                    H1(i);
                    if (Intrinsics.LJFF(B1().getText(), upperCase)) {
                        return;
                    }
                    if (this.LLJJL) {
                        C1105310erx c1105310erxB1 = B1();
                        if (!c1105310erxB1.LLJZ) {
                            c1105310erxB1.LJJLIIIJLLLLLLLZ();
                        }
                        boolean zLJFF = true ^ Intrinsics.LJFF(c1105310erxB1.LLJLLIL, c1105310erxB1.getText());
                        if (zLJFF || !Intrinsics.LJFF(upperCase, c1105310erxB1.getText())) {
                            boolean zLJJLIIJ = c1105310erxB1.LJJLIIJ(upperCase);
                            float f = c1105310erxB1.LLJLILLLLZIIL + 0.0f;
                            if (zLJFF || zLJJLIIJ) {
                                int i2 = (int) (c1105310erxB1.LLLFF.LIZLLL + f);
                                int i3 = c1105310erxB1.LLL;
                                if (i2 > i3) {
                                    i2 = i3;
                                }
                                if (i2 != c1105310erxB1.getLayoutParams().width) {
                                    c1105310erxB1.getLayoutParams().width = i2;
                                    ViewGroup.LayoutParams layoutParams = c1105310erxB1.getLayoutParams();
                                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1105310erxB1);
                                    c1105310erxB1.setLayoutParams(layoutParams);
                                }
                            }
                            c1105310erxB1.LLJLLIL = upperCase;
                            c1105310erxB1.LLJLLL = upperCase;
                            c1105310erxB1.setText(upperCase);
                        }
                    } else {
                        B1().setText(upperCase);
                    }
                    CharSequence text = B1().getText();
                    if (text != null) {
                        string = text.toString();
                    }
                    this.LLJJJJLIIL = string;
                    LLII(false, false);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onInit(Object[] objArr) {
        DataChannel dataChannel;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (LiveMainFrameworkExpandOnlineSetting.INSTANCE.enable() && (dataChannel = this.dataChannel) != null && Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.TRUE)) {
            View view = getView();
            if (view != null) {
                AnonymousClass0126.LIZ(view, 36);
            }
            ViewGroup.LayoutParams layoutParams = C1().getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = (int) C497740JfY.LIZIZ(6.0f);
                marginLayoutParams.bottomMargin = (int) C497740JfY.LIZIZ(6.0f);
                C786410Ut5.W5(C1(), marginLayoutParams);
            }
            View view2 = getView();
            if (view2 != null) {
                C635860Owq.LIZ(view2, 0, 0, 4, 0);
            }
            View viewC1 = C1();
            if (viewC1 != null) {
                C635860Owq.LIZ(viewC1, 0, 6, 0, 6);
            }
        }
        if (LiveMainFrameUpdateFontOptSetting.INSTANCE.disableFontSizeScale()) {
            C1119850fFP c1119850fFP = C011Z.LIZ;
            View view3 = this.contentView;
            c1119850fFP.getClass();
            C1119850fFP.LIZ(view3);
        }
    }

    /* JADX WARN: Type inference failed for: r1v31, types: [X.0es6] */
    @Override // com.bytedance.android.live.performance.widget.RoomRecycleFunctionWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) throws Throwable {
        boolean zBooleanValue;
        Boolean boolValueOf;
        Long lValueOf;
        Long lValueOf2;
        boolean z;
        int i;
        AbstractC1086230eNB c1086270eNF;
        int iLIZIZ;
        DataChannel dataChannel;
        float f;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        GradientDrawable gradientDrawable;
        C1091770eW7 c1091770eW7;
        IMessageManager iMessageManager;
        Long l;
        int i2;
        String upperCase;
        Room roomLJJLIIIIJ;
        boolean z2;
        User owner;
        Boolean bool;
        super.onLoad(objArr);
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool = (Boolean) dataChannel2.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLJJJJ = zBooleanValue;
        LiveU18HiddenCountSetting liveU18HiddenCountSetting = LiveU18HiddenCountSetting.INSTANCE;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel3));
        } else {
            boolValueOf = null;
        }
        this.LLJJL = liveU18HiddenCountSetting.showEngagementCount(boolValueOf);
        if (!C1105600esQ.LIZ && OnlineAudienceGeckoSetting.INSTANCE.getValue().isAudienceListGeckoSettingOn) {
            C1105600esQ.LIZ = true;
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0eBJ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("OnlineAudienceRankWidget@5757.trySetGeckoChannel$1");
                    try {
                        IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
                        OnlineAudienceGeckoSetting onlineAudienceGeckoSetting = OnlineAudienceGeckoSetting.INSTANCE;
                        boolean zU61 = iHostResource.u61(onlineAudienceGeckoSetting.getValue().audienceListGeckoChannel);
                        String str = onlineAudienceGeckoSetting.getValue().audienceListGeckoChannel;
                        if (!zU61 && !TextUtils.isEmpty(str)) {
                            iHostResource.NP0(str);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("OnlineAudienceRankWidget@5757.trySetGeckoChannel$1");
                }
            });
        }
        C1105360es2.LIZLLL = 1;
        C1105360es2.LIZ = new OnlineRankListResponse();
        C1105360es2.LIZIZ = "";
        C1105360es2.LIZJ.LIZ.clear();
        ViewStub viewStub = (ViewStub) findViewById(R.id.pmt);
        LiveLayoutRenderingScopeOptimizationSetting liveLayoutRenderingScopeOptimizationSetting = LiveLayoutRenderingScopeOptimizationSetting.INSTANCE;
        if (liveLayoutRenderingScopeOptimizationSetting.getValue().audienceRankingOpt) {
            if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.gxh);
            }
            this.LLIZ = (FrameLayout) findViewById(R.id.i32);
            if (viewStub != null) {
                C786410Ut5.LJLLLL(viewStub);
            }
        } else if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.gxg);
            C786410Ut5.LJLLLL(viewStub);
        }
        if (liveLayoutRenderingScopeOptimizationSetting.getValue().audienceRankingOpt) {
            this.LLIZ = (FrameLayout) findViewById(R.id.i32);
        }
        B1().setFontFeatureSettings("tnum");
        B1().setLetterSpacing(-0.04f);
        if (LiveMainFrameUpdateFontOptSetting.INSTANCE.disableFontSizeScale()) {
            B1().setMaxFontScaleRate(1.0f);
        }
        H1(0);
        this.LLJILLL = (Room) this.dataChannel.gg0(RoomChannel.class);
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("user_id", Long.valueOf(UserService.getInstance().user().getCurrentUserId()));
        Room room = this.LLJILLL;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        pairArr[1] = new Pair("room_id", lValueOf);
        Room room2 = this.LLJILLL;
        if (room2 != null && (owner = room2.getOwner()) != null) {
            lValueOf2 = Long.valueOf(owner.getId());
        } else {
            lValueOf2 = null;
        }
        pairArr[2] = new Pair("anchor_id", lValueOf2);
        pairArr[3] = new Pair("is_anchor", Integer.valueOf(C500260Jjc.LJIIZILJ(this.dataChannel) ? 1 : 0));
        Map<? extends String, ? extends Object> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        Map<String, Object> map = C497680JfS.LIZ;
        ((LinkedHashMap) map).clear();
        map.putAll(mapLJIIIIZZ);
        final DataChannel dataChannel4 = this.dataChannel;
        this.LLILLL = (AudienceRankingEntranceViewModel) new ViewModelProvider.Factory(dataChannel4) { // from class: X.01O1
            public final DataChannel LIZ;

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            {
                this.LIZ = dataChannel4;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [X.00hX] */
            /* JADX WARN: Type inference failed for: r1v1, types: [X.00hZ] */
            /* JADX WARN: Type inference failed for: r3v0, types: [X.00hE] */
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                C20441214yg.LIZIZ("AudienceRankingEntranceViewModelFactory", "create");
                C147600hO c147600hO = new C147600hO(new InterfaceC146700hF(this.LIZ) { // from class: X.00hE
                    public final Room LIZ;

                    @Override // X.InterfaceC146700hF
                    public final OnlineAudience LIZJ() {
                        C20441214yg.LIZIZ("LocalAudienceRankingDataSourceImpl", "getTopViewerRankingDataFromRoom");
                        Room room3 = this.LIZ;
                        if (room3 != null) {
                            return room3.onlineAudience;
                        }
                        return null;
                    }

                    @Override // X.InterfaceC146700hF
                    public final EcomRankInfo LIZLLL() {
                        C20441214yg.LIZIZ("LocalAudienceRankingDataSourceImpl", "getTopBuyerRankingDataFromRoom");
                        Room room3 = this.LIZ;
                        if (room3 != null) {
                            return room3.ecomRankInfo;
                        }
                        return null;
                    }

                    {
                        this.LIZ = (Room) dataChannel.gg0(RoomChannel.class);
                    }
                }, new C148800ha(this.LIZ), new Object() { // from class: X.00hZ
                }, new Object() { // from class: X.00hX
                });
                return new AudienceRankingEntranceViewModel(this.LIZ, c147600hO, new C01PF(c147600hO, this.LIZ), new C192000oY(c147600hO), new C01O8(c147600hO));
            }
        }.create(AudienceRankingEntranceViewModel.class);
        C1105320ery c1105320ery = new C1105320ery(this.dataChannel);
        this.LLILZ = c1105320ery;
        c1105320ery.LIZJ(this);
        AudienceRankingEntranceViewModel audienceRankingEntranceViewModel = this.LLILLL;
        if (audienceRankingEntranceViewModel != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C01VF(audienceRankingEntranceViewModel, this, null), 3);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C01VD(audienceRankingEntranceViewModel, this, null), 3);
        }
        LinearLayout linearLayoutA1 = A1();
        if (linearLayoutA1 != null) {
            C786410Ut5.LJZL(0, linearLayoutA1);
            DataChannel dataChannel5 = this.dataChannel;
            C1105320ery c1105320ery2 = this.LLILZ;
            if ((c1105320ery2 instanceof C1105320ery) && c1105320ery2 != null) {
                z2 = c1105320ery2.LLIZLLLIL.scoreShow;
            } else {
                z2 = true;
            }
            this.LLJJIJI = new C1105340es0(dataChannel5, linearLayoutA1, z2);
        }
        B1().LJJLIIIJLJLI(C1697810uHb.LJIIJJI("K", "M", "B"));
        if (C011Z.LIZ.LJJII() && ((int) C497740JfY.LIZIZ(310.0f)) > C14KS.LJFF()) {
            ViewGroup.LayoutParams layoutParams = z1().getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = 0;
            }
            ViewGroup.LayoutParams layoutParams2 = z1().getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = 0;
            }
        }
        C1105320ery c1105320ery3 = this.LLILZ;
        if ((c1105320ery3 instanceof C1105320ery) && c1105320ery3.LJI()) {
            z = true;
        } else {
            z = false;
        }
        C1105320ery c1105320ery4 = this.LLILZ;
        boolean z3 = c1105320ery4 instanceof C1105320ery;
        if (z3 && c1105320ery4 != null) {
            i = c1105320ery4.LLILZIL;
        } else {
            i = 0;
        }
        if (z && i >= 1) {
            if (z3 && c1105320ery4 != null) {
                i2 = c1105320ery4.LLILZIL;
            } else {
                i2 = 0;
            }
            H1(i2);
            C1105310erx c1105310erxB1 = B1();
            if (!this.LLJJL) {
                upperCase = C497740JfY.LJIJI(2131844654);
            } else {
                upperCase = C1850730yGF.LIZJ(i2).toUpperCase(Locale.ENGLISH);
            }
            c1105310erxB1.setText(upperCase);
            C786410Ut5.LJLLLLLL(0, C1());
            DataChannel dataChannel6 = this.dataChannel;
            if (dataChannel6 != null) {
                roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel6);
            } else {
                roomLJJLIIIIJ = null;
            }
            C235200vW.LIZ(roomLJJLIIIIJ, "livesdk_liveroom_audience_number_show", this.dataChannel, null);
            this.LLJJJJLIIL = String.valueOf(B1().getText());
            LLII(false, false);
        } else {
            C786410Ut5.LJLLLLLL(8, C1());
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1105820esm() { // from class: X.0esA
            @Override // X.AbstractViewOnClickListenerC1105820esm
            public final void LIZ() {
                OnlineAudienceRankWidget onlineAudienceRankWidget = this.LLILZIL;
                int i3 = OnlineAudienceRankWidget.LLJLLIL;
                onlineAudienceRankWidget.G1(null);
                if (LiveMainFrameworkUpdateTopOneLineCheckLogReportSetting.INSTANCE.enableReport()) {
                    C235200vW.LIZ(C500260Jjc.LJJLIIIIJ(this.LLILZIL.dataChannel), "livesdk_liveroom_audience_number_click_frame_check", this.LLILZIL.dataChannel, null);
                }
            }

            {
                super(1200L);
            }
        }, C1());
        long jLongValue = 0;
        if (objArr != null) {
            int length = objArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                Object obj = objArr[i3];
                if ((obj instanceof C780920UkE) && ((C780920UkE) obj).LIZ > 0) {
                    if (obj != null) {
                        C497680JfS.LIZIZ = ((C780920UkE) obj).LIZ;
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_livesdk_online_audience_rank_widget_load_finished", 0.0d)) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.putAll(C497680JfS.LIZ);
                            long j = C497680JfS.LIZIZ;
                            long j2 = -1;
                            if (j != -1) {
                                j2 = jElapsedRealtime - j;
                            }
                            linkedHashMap.put("duration", Long.valueOf(j2));
                            C501590Jll.LIZLLL(linkedHashMap);
                            C497680JfS.LIZ(0, "widget_load_finished", linkedHashMap);
                        }
                    }
                } else {
                    i3++;
                }
            }
        }
        DataChannel dataChannel7 = this.dataChannel;
        dataChannel7.BQ2(this, AudienceRankSettingEvent.class, new AwS596S0100000_17(this, 742));
        dataChannel7.BQ2(this, GameFloatingWindowAudienceClickEvent.class, new AwS596S0100000_17(this, 743));
        dataChannel7.BQ2(this, CloseAudienceRankDialogEvent.class, new AwS596S0100000_17(this, 744));
        DataChannelGlobal.LLILZ.BQ2(this, this, OpenAudienceRankingEvent.class, new AwS596S0100000_17(this, 745));
        DataChannelGlobal.LLILZ.BQ2(this, this, OpenAudienceRankingWithParamsEvent.class, new AwS596S0100000_17(this, 746));
        DataChannelGlobal.LLILZ.BQ2(this, this, CloseAudienceRankingEvent.class, new AwS596S0100000_17(this, 747));
        DataChannelGlobal.LLILZ.BQ2(this, this, LopUnlockEvent.class, new AwS596S0100000_17(this, 748));
        C784440Upu.LIZ().LIZJ(this, C1085120eLO.class).LIZJ(new AfS186S0100000_17(this, 208));
        C1548820qPI.LIZLLL("ttlive_flare_viewers_list", this.LLJLL);
        C1548820qPI.LIZLLL("audience_ranking_pop_event", this.LLJLL);
        C1548820qPI.LIZLLL("audience_ranking_data", this.LLJLL);
        DataChannel dataChannel8 = this.dataChannel;
        if (dataChannel8 != null && C500260Jjc.LJIJI(dataChannel8)) {
            ((C0J1N) UserService.getInstance().user().LJFF().LJJIL(new C1151830g4z(this, 1)).LIZJ(C11RD.LJ(this))).LIZJ(new AfS181S0100000_12(this, 330));
        }
        ImageView imageView = (ImageView) findViewById(R.id.hfd);
        this.LLJIJIL = imageView;
        if (imageView != null) {
            C500260Jjc.LJIILIIL(imageView);
        }
        C0JT6<Boolean> c0jt6 = InterfaceC1106030et7.z6;
        if (!Intrinsics.LJFF(c0jt6.LIZ(), Boolean.FALSE) && C783600UoY.LIZ(this.dataChannel)) {
            c0jt6.LIZJ(Boolean.TRUE);
            this.LLJILJILJ = new ARunnableS112S0100000_12(this, 142);
            View view = getView();
            if (view != null) {
                HandlerHook.viewPostDelay(view, this.LLJILJILJ, 300000L);
            }
        }
        if (!this.LLJJLIIIJLLLLLLLZ) {
            this.LLJJLIIIJLLLLLLLZ = true;
            if (!D1()) {
                C0IZP.LIZJ(this.LLJILLL, "watch_cnt");
            }
        }
        y1();
        ?? r1 = new InterfaceC1086210eN9() { // from class: X.0es6
            @Override // X.InterfaceC1086210eN9
            public final void LIZ() {
                List<C1105460esC> list;
                View view2;
                OnlineAudienceRankWidget onlineAudienceRankWidget = this.LIZ;
                onlineAudienceRankWidget.LLJJJ = false;
                if (!onlineAudienceRankWidget.LLJJJJ && (view2 = onlineAudienceRankWidget.getView()) != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                    marginLayoutParams2.width = 0;
                    C786410Ut5.W5(view2, marginLayoutParams2);
                }
                OnlineAudienceRankWidget onlineAudienceRankWidget2 = this.LIZ;
                C1105340es0 c1105340es0 = onlineAudienceRankWidget2.LLJJIJI;
                onlineAudienceRankWidget2.S((c1105340es0 == null || (list = c1105340es0.LJIIJJI) == null) ? 0 : list.size());
                this.LIZ.LLII(false, false);
            }

            @Override // X.InterfaceC1086210eN9
            public final void LIZIZ() {
                View view2;
                OnlineAudienceRankWidget onlineAudienceRankWidget = this.LIZ;
                onlineAudienceRankWidget.LLJJJ = true;
                if (!onlineAudienceRankWidget.LLJJJJ && (view2 = onlineAudienceRankWidget.getView()) != null) {
                    ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                    if (layoutParams3 == null) {
                        return;
                    }
                    layoutParams3.width = -2;
                    C786410Ut5.W5(view2, layoutParams3);
                }
                this.LIZ.LJJLIIIJJI();
                if (this.LIZ.z1().getVisibility() == 0) {
                    C500260Jjc.LJIILIIL(this.LIZ.z1());
                }
                OnlineAudienceRankWidget.x1(this.LIZ.LLIZ, Float.valueOf(8.0f));
                this.LIZ.LLII(false, false);
            }

            @Override // X.InterfaceC1086210eN9
            public final void LIZJ() {
                this.LIZ.LLII(false, true);
            }
        };
        if (AudienceListPromoteAwarenessTypeSetting.INSTANCE.enablePromote()) {
            c1086270eNF = new C1086260eNE(r1);
        } else {
            c1086270eNF = new C1086270eNF(r1);
        }
        c1086270eNF.LJFF(getView(), this, this.dataChannel);
        this.LLJJIJIIJIL = c1086270eNF;
        if (C500260Jjc.LJIIZILJ(this.dataChannel)) {
            C251600yA c251600yA = new C251600yA();
            DataChannel dataChannel9 = this.dataChannel;
            c251600yA.LL = dataChannel9;
            if (dataChannel9 != null && (l = (Long) dataChannel9.gg0(C751340Tdc.class)) != null) {
                jLongValue = l.longValue();
            }
            c251600yA.LLILLJJLI = jLongValue;
            if (dataChannel9 != null && (iMessageManager = (IMessageManager) dataChannel9.gg0(C776250Uch.class)) != null) {
                iMessageManager.addMessageListener(C001A.GIFT_BOOST_CARD_MESSAGE.getIntType(), c251600yA);
            }
            c251600yA.LLILLL.LIZ(C11NZ.LJLJJLL(5L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C516201zk(c251600yA, 126)));
            this.LLJJIJIL = c251600yA;
        }
        int iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.ezs, C1834150xpV.LJII(this.context));
        if (((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).db0(this.LLJILLL, null)) {
            iLIZIZ = C20736316Cj.LIZIZ(R.attr.ep5, C1834150xpV.LJII(this.context));
        } else {
            iLIZIZ = C20736316Cj.LIZIZ(R.attr.exm, C1834150xpV.LJII(this.context));
        }
        this.LLJJJ = false;
        if (!Intrinsics.LJFF(this.dataChannel.gg0(C0TZM.class), Boolean.TRUE)) {
            I1();
        }
        LinearLayout linearLayoutA12 = A1();
        if ((linearLayoutA12 instanceof C1091770eW7) && (c1091770eW7 = (C1091770eW7) linearLayoutA12) != null) {
            c1091770eW7.setReverse(true);
        }
        C1().setElevation(1.0f);
        Drawable background = C1().getBackground();
        if (background != null && (background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
            gradientDrawable.setColor(iLIZIZ);
            gradientDrawable.setStroke(0, iLIZIZ);
        }
        LinearLayout linearLayoutA13 = A1();
        if (linearLayoutA13 != null) {
            linearLayoutA13.setElevation(2.0f);
        }
        View view2 = (View) this.LLJJIII.getValue();
        if (view2 != null) {
            view2.setElevation(3.0f);
        }
        B1().setTextColor(iLIZIZ2);
        DataChannel dataChannel10 = this.dataChannel;
        if (dataChannel10 != null && C500260Jjc.LJIJI(dataChannel10)) {
            LiveMainFrameworkUpdateTopOneLineSizeConfigSetting liveMainFrameworkUpdateTopOneLineSizeConfigSetting = LiveMainFrameworkUpdateTopOneLineSizeConfigSetting.INSTANCE;
            int iLIZIZ3 = (int) C497740JfY.LIZIZ(liveMainFrameworkUpdateTopOneLineSizeConfigSetting.skylightLeftMarginOrDefault(12));
            if (liveMainFrameworkUpdateTopOneLineSizeConfigSetting.variableMargin() > 0) {
                f = 0.0f;
            } else {
                f = 8.0f;
            }
            Integer numValueOf = Integer.valueOf((int) C497740JfY.LIZIZ(f));
            Integer numValueOf2 = Integer.valueOf(iLIZIZ3);
            View view3 = getView();
            if (view3 != null) {
                ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                    if (numValueOf != null) {
                        marginLayoutParams.setMarginStart(numValueOf.intValue());
                    }
                    if (numValueOf2 != null) {
                        marginLayoutParams.setMarginEnd(numValueOf2.intValue());
                    }
                    C786410Ut5.W5(view3, marginLayoutParams);
                }
            }
        }
        B1().setSingleLine(true);
        B1().setIncludeFontPadding(false);
        if (LiveMainFrameworkFixSetting.INSTANCE.enableUpdateViewerWhenFollowChange() && (dataChannel = this.dataChannel) != null) {
            dataChannel.BQ2(this, UserContainerWidgetChangeEvent.class, new AwS596S0100000_17(this, 231));
        }
    }

    public static void x1(View view, Float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (f != null) {
                f.floatValue();
                marginLayoutParams.setMarginStart((int) C497740JfY.LIZIZ(f.floatValue()));
            }
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }

    public final void F1(List<C1105460esC> list, boolean z) {
        if (!this.LLJJJ && !E1()) {
            ARunnableS18S0210000_17 aRunnableS18S0210000_17 = new ARunnableS18S0210000_17(this, list, z, 0);
            if (z) {
                LinearLayout linearLayoutA1 = A1();
                if (linearLayoutA1 != null) {
                    linearLayoutA1.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1151590g4b(aRunnableS18S0210000_17, this, 1));
                    return;
                }
                return;
            }
            LinearLayout linearLayoutA12 = A1();
            if (linearLayoutA12 == null) {
                return;
            }
            HandlerHook.viewPost(linearLayoutA12, aRunnableS18S0210000_17);
        }
    }

    @Override // X.InterfaceC1105450esB
    public final void LLII(boolean z, boolean z2) {
        DataChannel dataChannel;
        float fMeasureText;
        int measuredWidth;
        LinearLayout linearLayoutA1;
        List<C1105460esC> list;
        C1105340es0 c1105340es0;
        List<C1105460esC> list2;
        if (!this.LLJJJJ && (dataChannel = this.dataChannel) != null && Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.TRUE)) {
            boolean zEnable = LiveMainFrameworkUpdateReduceMeasureSetting.INSTANCE.enable();
            String str = CardStruct.IStatusCode.DEFAULT;
            if (!zEnable && (c1105340es0 = this.LLJJIJI) != null && (list2 = c1105340es0.LJIIJJI) != null && list2.size() > 0) {
                float fLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
                TextPaint paint = B1().getPaint();
                String str2 = this.LLJJJJLIIL;
                if (str2 == null) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                fMeasureText = Math.max(fLIZIZ + paint.measureText(str2), (int) C497740JfY.LIZIZ(38.0f));
            } else {
                float fLIZIZ2 = (int) C497740JfY.LIZIZ(29.0f);
                TextPaint paint2 = B1().getPaint();
                String str3 = this.LLJJJJLIIL;
                if (str3 == null) {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                fMeasureText = fLIZIZ2 + paint2.measureText(str3);
            }
            if (LiveMainFrameworkUpdateTopOneLineSizeConfigSetting.INSTANCE.showAtLastOneViewer() && this.LLJJJJJIL > 0) {
                float fLIZIZ3 = (int) C497740JfY.LIZIZ(16.0f);
                TextPaint paint3 = B1().getPaint();
                String str4 = this.LLJJJJLIIL;
                if (str4 != null) {
                    str = str4;
                }
                float fMeasureText2 = fLIZIZ3 + paint3.measureText(str);
                float fLIZIZ4 = (int) C497740JfY.LIZIZ(38.0f);
                if (fMeasureText2 < fLIZIZ4) {
                    fMeasureText2 = fLIZIZ4;
                }
                fMeasureText = fMeasureText2 + ((int) C497740JfY.LIZIZ(this.LLILLJJLI));
            }
            View view = getView();
            if (view != null) {
                if (z2 || this.LLJJJ) {
                    if (z) {
                        View view2 = getView();
                        if (view2 != null) {
                            measuredWidth = view2.getWidth();
                        } else {
                            measuredWidth = 0;
                        }
                    } else {
                        view.measure(0, 0);
                        measuredWidth = view.getMeasuredWidth();
                    }
                    float f = measuredWidth;
                    if (fMeasureText < f) {
                        fMeasureText = f;
                    }
                }
                if ((LiveOnlineRankOnWidthChangeOptSetting.INSTANCE.enable() && view.getWidth() >= fMeasureText) || this.LLJJJIL == fMeasureText) {
                    return;
                }
                this.LLJJJIL = fMeasureText;
                C497740JfY.LIZIZ(this.LLILLJJLI);
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null) {
                    C1105340es0 c1105340es02 = this.LLJJIJI;
                    if (c1105340es02 != null && (list = c1105340es02.LJIIJJI) != null) {
                        list.size();
                    }
                    C1105340es0 c1105340es03 = this.LLJJIJI;
                    if (c1105340es03 != null && ((c1105340es03.LJFF.getVisibility() == 0 || c1105340es03.LJI.getVisibility() == 0) && (linearLayoutA1 = A1()) != null)) {
                        linearLayoutA1.getVisibility();
                    }
                    dataChannel2.zW(ChangeOnlineRankWidth.class, new C1086100eMy(fMeasureText));
                }
            }
        }
    }

    @Override // X.InterfaceC1105450esB
    public final void LLLZIIL(List<C1105460esC> list, boolean z) {
        int i;
        EnumC187400no enumC187400noVQ2;
        try {
            if (isViewValid()) {
                if (this.context != null) {
                    if (!this.LLIZLLLIL) {
                        this.LLIZLLLIL = true;
                        Long l = (Long) this.dataChannel.gg0(C1082850eHj.class);
                        if (l != null) {
                            l.longValue();
                            C464360IIw.LIZIZ(this.dataChannel, "audience_list_widget_load_duration", String.valueOf(System.currentTimeMillis() - l.longValue()));
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    if (!C500260Jjc.LJIIZILJ(this.dataChannel)) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = ((ArrayList) list).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            if (((C1105460esC) next).LIZIZ > 0) {
                                arrayList2.add(next);
                            }
                        }
                        arrayList.addAll(arrayList2);
                        int iMin = Math.min(2, C1810700xDg.LJFF) - arrayList.size();
                        for (i = 0; i < iMin; i++) {
                            User user = new User();
                            AudienceRankingEntranceViewModel audienceRankingEntranceViewModel = this.LLILLL;
                            if (audienceRankingEntranceViewModel == null || (enumC187400noVQ2 = audienceRankingEntranceViewModel.vQ2()) == null) {
                                enumC187400noVQ2 = EnumC187400no.TOP_VIEWER;
                            }
                            arrayList.add(new C1105460esC(user, 0L, 0L, "", 0L, enumC187400noVQ2));
                        }
                    } else {
                        arrayList.addAll(list);
                    }
                    this.LLJLILLLLZIIL = new ArrayList(arrayList);
                    F1(arrayList, z);
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
