package com.ss.android.ugc.aweme.hangout.component.livecard.view;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C098200Yq;
import X.C0IVR;
import X.C12ES;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C15CF;
import X.C1697810uHb;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C20441214yg;
import X.C21569419bA;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C426750GoL;
import X.C439101nJ;
import X.C446000HeI;
import X.C452080Ho6;
import X.C452501pT;
import X.C477500Io0;
import X.C477510Io1;
import X.C477860Ioa;
import X.C477870Iob;
import X.C477920Iog;
import X.C478090Iox;
import X.C479150Iqf;
import X.C479170Iqh;
import X.C497740JfY;
import X.C500260Jjc;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ALAdapterS4S0200000_7;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS1S0120000_7;
import Y.AUListenerS76S0110000_7;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestTopLiveParmasConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.OptimizeEnterRoomPipelineSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveHangoutPerformanceOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptV2Setting;
import com.bytedance.android.livesdk.livesetting.linkmic.TtliveHangoutEnableLiveCardAudioPlayerSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.MultiTopLivePlayFeedListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import webcast.api.feed.MGModuleTab;
import webcast.data.CardTag;

/* JADX INFO: loaded from: classes8.dex */
public final class PlayCardFeedCellV2 extends BaseMultiFeedPowerCell<C479150Iqf> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final AssemVMLazy LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public C478090Iox LLJJIJIIJIL;
    public long LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public int LLJJJJ;
    public AnimatorSet LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PlayCardFeedCellV2.class, "playFeedListVM", "getPlayFeedListVM()Lcom/ss/android/ugc/aweme/hangout/component/livecard/viewmodel/MultiTopLivePlayFeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PlayCardFeedCellV2() {
        AssemVMLazy assemVMLazy;
        super(0);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 245));
        this.LLILLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 269));
        this.LLILZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 253));
        this.LLILZIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 258));
        this.LLILZLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 259));
        this.LLIZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 233));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 234));
        this.LLJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 237));
        this.LLJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 241));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 239));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 242));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 255));
        this.LLJILLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 243));
        this.LLJJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 236));
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MultiTopLivePlayFeedListViewModel.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 240);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(87);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS551S0100000_7(c19719912DlLIZ, 257), awS551S0100000_7, AFwS193S0000000_7.get$arr$(135), new AwS551S0100000_7((C03K6) this, 260), new AwS551S0100000_7((C03K6) this, 262), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 264), aFwS237S0000000_7, new AwS551S0100000_7((C03K6) this, 266), null, new AwS551S0100000_7((C03K6) this, 267));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS551S0100000_7 awS551S0100000_72 = new AwS551S0100000_7((C03K6) this, 261);
            AwS551S0100000_7 awS551S0100000_73 = new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 263);
            AwS551S0100000_7 awS551S0100000_74 = new AwS551S0100000_7(c19719912DlLIZ, 265);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS408S0200000_7((InterfaceC451590HnJ) obj, awS551S0100000_72, 20));
            AwS551S0100000_7 awS551S0100000_75 = new AwS551S0100000_7(c01gwLIZIZ, 268);
            AwS551S0100000_7 awS551S0100000_76 = new AwS551S0100000_7(c01gwLIZIZ, 270);
            AwS551S0100000_7 awS551S0100000_77 = new AwS551S0100000_7(c01gwLIZIZ, 231);
            AwS551S0100000_7 awS551S0100000_78 = new AwS551S0100000_7(c01gwLIZIZ, 232);
            AwS551S0100000_7 awS551S0100000_79 = new AwS551S0100000_7(c01gwLIZIZ, 235);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS551S0100000_74, awS551S0100000_7, new C452080Ho6(), awS551S0100000_75, awS551S0100000_76, awS551S0100000_73, aFwS237S0000000_7, awS551S0100000_77, awS551S0100000_78, awS551S0100000_79);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS551S0100000_7(c19719912DlLIZ, 238), awS551S0100000_7, AFwS193S0000000_7.get$arr$(132), new AwS551S0100000_7((C03K6) this, 244), new AwS551S0100000_7((C03K6) this, 246), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 247), aFwS237S0000000_7, new AwS551S0100000_7((C03K6) this, 248), null, new AwS551S0100000_7((C03K6) this, 249));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS551S0100000_7(c19719912DlLIZ, 250), awS551S0100000_7, AFwS193S0000000_7.get$arr$(133), new AwS551S0100000_7((C03K6) this, 251), new AwS551S0100000_7((C03K6) this, 252), new AwS551S0100000_7((C03K6) this, 254), aFwS237S0000000_7, null, null, new AwS551S0100000_7((C03K6) this, 256));
        }
        this.LLJJI = assemVMLazy;
        this.LLJJJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(134));
        this.LLJJJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(131));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N5() {
        String feedCardEnterMethodV2;
        C479150Iqf c479150Iqf;
        C479170Iqh c479170Iqh;
        C479170Iqh c479170Iqh2;
        MGModuleTab mGModuleTab;
        C479170Iqh c479170Iqh3;
        C479170Iqh c479170Iqh4;
        Room room;
        User owner;
        this.LLJJIJI = true;
        u6(true, true);
        this.itemView.setBackgroundResource(R.drawable.ck1);
        C479150Iqf c479150Iqf2 = (C479150Iqf) getItem();
        long id = (c479150Iqf2 == null || (c479170Iqh4 = c479150Iqf2.LLILLL) == null || (room = c479170Iqh4.LJFF) == null || (owner = room.getOwner()) == null) ? -1L : owner.getId();
        C479150Iqf c479150Iqf3 = (C479150Iqf) getItem();
        long j = (c479150Iqf3 == null || (c479170Iqh3 = c479150Iqf3.LLILLL) == null) ? -1L : c479170Iqh3.LIZ;
        C479150Iqf c479150Iqf4 = (C479150Iqf) getItem();
        if ((c479150Iqf4 == null || (c479170Iqh2 = c479150Iqf4.LLILLL) == null || (mGModuleTab = c479170Iqh2.LJI) == null || (feedCardEnterMethodV2 = mGModuleTab.name) == null) && (feedCardEnterMethodV2 = MultiGuestTopLiveParmasConfigSetting.INSTANCE.getFeedCardEnterMethodV2()) == null) {
            feedCardEnterMethodV2 = "hangout_live_cell_all";
        }
        C477920Iog c477920Iog = new C477920Iog(id, j, "live_merge", feedCardEnterMethodV2, "click", System.currentTimeMillis(), 64);
        long j2 = c477920Iog.LIZ;
        long j3 = c477920Iog.LIZIZ;
        if (j2 > 0 && j3 > 0 && c477920Iog.LJFF > 0) {
            C477860Ioa.LJ = c477920Iog;
        }
        if (TtliveHangoutEnableLiveCardAudioPlayerSetting.INSTANCE.isEnable() && (c479150Iqf = (C479150Iqf) getItem()) != null && (c479170Iqh = c479150Iqf.LLILLL) != null) {
            MultiTopLivePlayFeedListViewModel multiTopLivePlayFeedListViewModelV5 = V5();
            Long l = multiTopLivePlayFeedListViewModelV5.LLILLL;
            long j4 = c479170Iqh.LIZ;
            if ((l == null || l.longValue() != j4) && !multiTopLivePlayFeedListViewModelV5.LLILZ) {
                C477500Io0 c477500Io0 = C477500Io0.LIZ;
                long j5 = c479170Iqh.LIZ;
                c477500Io0.getClass();
                multiTopLivePlayFeedListViewModelV5.AQ2(c479170Iqh, C477500Io0.LIZ(j5));
            }
        }
        v6();
        r6(false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dis;
    }

    public final void P5() {
        C500260Jjc.LJLJLJ((View) this.LLILLL.getValue(), true);
        ((C21569419bA) this.LLILLJJLI.getValue()).LIZIZ();
        C500260Jjc.LJLJLJ((View) this.LLILLJJLI.getValue(), false);
    }

    public final void R5() {
        AnimatorSet animatorSet = this.LLJJJJJIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLJJJJJIL = null;
        W5().clearAnimation();
        ((View) this.LLJILLL.getValue()).clearAnimation();
        b6().clearAnimation();
        W5().animate().cancel();
        ((View) this.LLJILLL.getValue()).animate().cancel();
        b6().animate().cancel();
    }

    public final C15CF T5() {
        return (C15CF) this.LLIZLLLIL.getValue();
    }

    public final MultiTopLivePlayFeedListViewModel V5() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (MultiTopLivePlayFeedListViewModel) assemVMLazy.getValue();
    }

    public final LinearLayout W5() {
        return (LinearLayout) this.LLJILJILJ.getValue();
    }

    public final int X5() {
        return ((Number) this.LLJJJ.getValue()).intValue();
    }

    public final LinearInterpolator a6() {
        return (LinearInterpolator) this.LLJJJIL.getValue();
    }

    public final TuxTextView b6() {
        return (TuxTextView) this.LLJJ.getValue();
    }

    public final void h6() {
        if (this.LLJJJJ > 0) {
            return;
        }
        int visibility = b6().getVisibility();
        float alpha = b6().getAlpha();
        C786410Ut5.LLLLZLL(b6(), 0);
        C786410Ut5.B5(b6(), 1.0f);
        W5().measure(View.MeasureSpec.makeMeasureSpec(0, 0), W5().getHeight() > 0 ? View.MeasureSpec.makeMeasureSpec(W5().getHeight(), 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = W5().getMeasuredWidth();
        int iX5 = X5();
        if (measuredWidth < iX5) {
            measuredWidth = iX5;
        }
        this.LLJJJJ = measuredWidth;
        C786410Ut5.LLLLZLL(b6(), visibility);
        C786410Ut5.B5(b6(), alpha);
    }

    public final void i6() {
        C500260Jjc.LJLJLJ((View) this.LLILLL.getValue(), false);
        C500260Jjc.LJLJLJ((View) this.LLILLJJLI.getValue(), true);
        ((C21569419bA) this.LLILLJJLI.getValue()).LJFF();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onPause() {
        if (TiktokLiveTopLiveArchitectureOptV2Setting.INSTANCE.getValue().optCardCpu) {
            ((C21569419bA) this.LLILLJJLI.getValue()).LJ();
        }
        super.onPause();
    }

    public final void v6() {
        if (!this.LLJJIJI || !TtliveHangoutEnableLiveCardAudioPlayerSetting.INSTANCE.isEnable()) {
            C500260Jjc.LJLJLJ((View) this.LLILZIL.getValue(), false);
            return;
        }
        C500260Jjc.LJLJLJ((View) this.LLILZIL.getValue(), true);
        if (V5().LLILZ) {
            ((LiveIconView) this.LLILZLL.getValue()).setIconAttr(R.attr.eel);
        } else {
            ((LiveIconView) this.LLILZLL.getValue()).setIconAttr(R.attr.eeh);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long S5() {
        C479170Iqh c479170Iqh;
        Room room;
        User owner;
        long id;
        C479170Iqh c479170Iqh2;
        Room room2;
        C479170Iqh c479170Iqh3;
        Room room3;
        C479150Iqf c479150Iqf = (C479150Iqf) getItem();
        if (((c479150Iqf == null || (c479170Iqh3 = c479150Iqf.LLILLL) == null || (room3 = c479170Iqh3.LJFF) == null) ? 0L : room3.getOwnerUserId()) > 0) {
            C479150Iqf c479150Iqf2 = (C479150Iqf) getItem();
            if (c479150Iqf2 == null || (c479170Iqh2 = c479150Iqf2.LLILLL) == null || (room2 = c479170Iqh2.LJFF) == null) {
                return null;
            }
            id = room2.getOwnerUserId();
        } else {
            C479150Iqf c479150Iqf3 = (C479150Iqf) getItem();
            if (c479150Iqf3 == null || (c479170Iqh = c479150Iqf3.LLILLL) == null || (room = c479170Iqh.LJFF) == null || (owner = room.getOwner()) == null) {
                return null;
            }
            id = owner.getId();
        }
        return Long.valueOf(id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String U5() {
        C479170Iqh c479170Iqh;
        MGModuleTab mGModuleTab;
        String str;
        String strLJJIFFI;
        C479150Iqf c479150Iqf = (C479150Iqf) getItem();
        return (c479150Iqf == null || (c479170Iqh = c479150Iqf.LLILLL) == null || (mGModuleTab = c479170Iqh.LJI) == null || (str = mGModuleTab.name) == null || (strLJJIFFI = u.LJJIFFI(str, "hangout_live_cell_", "", false)) == null) ? "all" : strLJJIFFI;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        P5();
        T5().LIZ();
        super.onDestroy();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onStop() {
        P5();
        T5().LIZ();
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.hangout.component.livecard.view.BaseMultiFeedPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        r6(false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        P5();
        T5().LIZ();
        AnimatorSet animatorSet = this.LLJJJJJIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLJJJJJIL = null;
        W5().clearAnimation();
        ((View) this.LLJILLL.getValue()).clearAnimation();
        b6().clearAnimation();
        W5().animate().cancel();
        ((View) this.LLJILLL.getValue()).animate().cancel();
        b6().animate().cancel();
        this.LLJJIJIIJIL = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    @Override // com.ss.android.ugc.aweme.hangout.component.livecard.view.BaseMultiFeedPowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L5(java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hangout.component.livecard.view.PlayCardFeedCellV2.L5(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c6(String str) {
        String string;
        String feedCardEnterMethodV2;
        Room room;
        String strLJJLIIIJ;
        C479170Iqh c479170Iqh;
        CardTag cardTag;
        C479170Iqh c479170Iqh2;
        List<CardTag> list;
        C479170Iqh c479170Iqh3;
        C479170Iqh c479170Iqh4;
        MGModuleTab mGModuleTab;
        C479170Iqh c479170Iqh5;
        Uri.Builder builderAuthority = new Uri.Builder().scheme("sslocal").authority("webcast_room");
        C479150Iqf c479150Iqf = (C479150Iqf) getItem();
        String str2 = null;
        if (c479150Iqf != null && (c479170Iqh5 = c479150Iqf.LLILLL) != null) {
            string = Long.valueOf(c479170Iqh5.LIZ).toString();
        } else {
            string = null;
        }
        Uri.Builder builderAppendQueryParameter = builderAuthority.appendQueryParameter("room_id", string).appendQueryParameter("enter_from", "live_merge");
        C479150Iqf c479150Iqf2 = (C479150Iqf) getItem();
        if (c479150Iqf2 == null || (c479170Iqh4 = c479150Iqf2.LLILLL) == null || (mGModuleTab = c479170Iqh4.LJI) == null || (feedCardEnterMethodV2 = mGModuleTab.name) == null) {
            feedCardEnterMethodV2 = MultiGuestTopLiveParmasConfigSetting.INSTANCE.getFeedCardEnterMethodV2();
        }
        builderAppendQueryParameter.appendQueryParameter("enter_method", feedCardEnterMethodV2);
        Uri uriBuild = builderAppendQueryParameter.appendQueryParameter("enter_from_merge", "live_merge").appendQueryParameter("is_from_mg_toplive", "1").build();
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        C0IVR.LJII(enterRoomConfig, uriBuild, true);
        C479150Iqf c479150Iqf3 = (C479150Iqf) getItem();
        if (c479150Iqf3 != null && (c479170Iqh3 = c479150Iqf3.LLILLL) != null) {
            room = c479170Iqh3.LJFF;
        } else {
            room = null;
        }
        C479150Iqf c479150Iqf4 = (C479150Iqf) getItem();
        if (c479150Iqf4 != null && (c479170Iqh2 = c479150Iqf4.LLILLL) != null && (list = c479170Iqh2.LJIIJ) != null) {
            ArrayList arrayList = new ArrayList();
            for (CardTag cardTag2 : list) {
                if (cardTag2.key.length() > 0) {
                    arrayList.add(cardTag2);
                }
            }
            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS237S0000000_7.get$arr$(86), 30);
        } else {
            strLJJLIIIJ = null;
        }
        C479150Iqf c479150Iqf5 = (C479150Iqf) getItem();
        if (c479150Iqf5 != null && (c479170Iqh = c479150Iqf5.LLILLL) != null && (cardTag = c479170Iqh.LIZLLL) != null) {
            str2 = cardTag.key;
        }
        C477860Ioa.LJFF(enterRoomConfig, room, str, new C477510Io1(strLJJLIIIJ, str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d6(String str) {
        Integer numValueOf;
        Long lValueOf;
        String requestId;
        Integer numValueOf2;
        String str2;
        String str3;
        Map<String, String> map;
        C479170Iqh c479170Iqh;
        Room room;
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        C479170Iqh c479170Iqh2;
        C479170Iqh c479170Iqh3;
        CardTag cardTag;
        C479170Iqh c479170Iqh4;
        Room room2;
        C479170Iqh c479170Iqh5;
        Room room3;
        C479170Iqh c479170Iqh6;
        C479170Iqh c479170Iqh7;
        Room room4;
        String strU5 = U5();
        C479150Iqf c479150Iqf = (C479150Iqf) getItem();
        if (c479150Iqf != null && (c479170Iqh7 = c479150Iqf.LLILLL) != null && (room4 = c479170Iqh7.LJFF) != null) {
            numValueOf = Integer.valueOf(C477860Ioa.LIZ(room4));
        } else {
            numValueOf = null;
        }
        Long lS5 = S5();
        C479150Iqf c479150Iqf2 = (C479150Iqf) getItem();
        if (c479150Iqf2 != null && (c479170Iqh6 = c479150Iqf2.LLILLL) != null) {
            lValueOf = Long.valueOf(c479170Iqh6.LIZ);
        } else {
            lValueOf = null;
        }
        C479150Iqf c479150Iqf3 = (C479150Iqf) getItem();
        if (c479150Iqf3 != null && (c479170Iqh5 = c479150Iqf3.LLILLL) != null && (room3 = c479170Iqh5.LJFF) != null) {
            requestId = room3.getRequestId();
        } else {
            requestId = null;
        }
        C479150Iqf c479150Iqf4 = (C479150Iqf) getItem();
        if (c479150Iqf4 != null && (c479170Iqh4 = c479150Iqf4.LLILLL) != null && (room2 = c479170Iqh4.LJFF) != null) {
            numValueOf2 = Integer.valueOf(room2.getUserCount());
        } else {
            numValueOf2 = null;
        }
        String strU52 = U5();
        C479150Iqf c479150Iqf5 = (C479150Iqf) getItem();
        if (c479150Iqf5 != null && (c479170Iqh3 = c479150Iqf5.LLILLL) != null && (cardTag = c479170Iqh3.LIZLLL) != null) {
            str2 = cardTag.text;
        } else {
            str2 = null;
        }
        C479150Iqf c479150Iqf6 = (C479150Iqf) getItem();
        if (c479150Iqf6 != null && (c479170Iqh2 = c479150Iqf6.LLILLL) != null) {
            str3 = c479170Iqh2.LIZIZ;
        } else {
            str3 = null;
        }
        Integer numValueOf3 = Integer.valueOf(getLayoutPosition() + 1);
        C479150Iqf c479150Iqf7 = (C479150Iqf) getItem();
        if (c479150Iqf7 != null && (c479170Iqh = c479150Iqf7.LLILLL) != null && (room = c479170Iqh.LJFF) != null && (multiLiveUserSettings = room.multiLiveUserSettings) != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null) {
            map = multiLiveUserApplySettings.extraInfo;
        } else {
            map = null;
        }
        C477860Ioa.LJIIIZ(new C477870Iob("play_card_feed", "live_cell", strU5, numValueOf, 1, lS5, lValueOf, requestId, numValueOf2, strU52, str2, str3, numValueOf3, null, map, 8192), str, null, 4);
    }

    @Override // com.ss.android.ugc.aweme.hangout.component.livecard.view.BaseMultiFeedPowerCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: e6, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C479150Iqf c479150Iqf) {
        String str;
        Object c098200Yq;
        ImageModel avatarThumb;
        String str2;
        Object c098200Yq2;
        String str3;
        String str4;
        ImageModel avatarThumb2;
        List<Long> list;
        String str5;
        String str6;
        Object c098200Yq3;
        super.onBindItemView(c479150Iqf);
        P5();
        int i = 0;
        this.LLJJIJI = false;
        u6(false, false);
        C500260Jjc.LJLJLJ((View) this.LLILZIL.getValue(), false);
        this.itemView.setBackgroundResource(R.drawable.ck0);
        r6(true);
        List<CardTag> list2 = c479150Iqf.LLILLL.LJIIJ;
        Context context = getContext();
        Object obj = null;
        if (context != null) {
            C786410Ut5.LJJJJJL((LinearLayout) this.LLILZ.getValue());
            if (list2 != null) {
                int i2 = 0;
                for (CardTag cardTag : list2) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        CardTag cardTag2 = cardTag;
                        if (!TextUtils.isEmpty(cardTag2.text)) {
                            C12ES.LJIILL(i, (View) this.LLILZ.getValue());
                            TuxTextView tuxTextView = new TuxTextView(context, null, 6, i);
                            C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
                            tuxTextView.setBackgroundResource(R.drawable.cjz);
                            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                            tuxTextView.setGravity(17);
                            tuxTextView.setLayoutDirection(2);
                            tuxTextView.setMaxLines(1);
                            int iLIZIZ = (int) C497740JfY.LIZIZ(6.0f);
                            int iLIZIZ2 = (int) C497740JfY.LIZIZ(2.0f);
                            tuxTextView.setPadding(iLIZIZ, iLIZIZ2, iLIZIZ, iLIZIZ2);
                            TypedValue typedValue = new TypedValue();
                            context.getTheme().resolveAttribute(R.attr.a1h, typedValue, true);
                            tuxTextView.setTextColor(typedValue.data);
                            tuxTextView.setTextDirection(5);
                            tuxTextView.setTuxFont(72);
                            tuxTextView.setText(cardTag2.text);
                            C426750GoL.LJIIIZ(tuxTextView, Integer.valueOf((int) C497740JfY.LIZIZ(8.0f)), null, Integer.valueOf(i), null, false, 26);
                            try {
                                String str7 = cardTag2.textColor;
                                if (str7 != null) {
                                    c098200Yq3 = Integer.valueOf(Color.parseColor(str7));
                                } else {
                                    c098200Yq3 = null;
                                }
                                C189200o6.m2constructorimpl(c098200Yq3);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq3 = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq3);
                            }
                            if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                                c098200Yq3 = null;
                            }
                            Integer num = (Integer) c098200Yq3;
                            if (num != null) {
                                tuxTextView.setTextColor(num.intValue());
                            }
                            ((ViewGroup) this.LLILZ.getValue()).addView(tuxTextView);
                        }
                        i2 = i3;
                        i = 0;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(c479150Iqf.LLILLL.LIZIZ)) {
            ((TextView) this.LLIZ.getValue()).setText(c479150Iqf.LLILLL.LIZIZ);
        }
        CardTag cardTag3 = c479150Iqf.LLILLL.LIZLLL;
        if (cardTag3 != null) {
            str = cardTag3.text;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView = (TextView) this.LLJILJIL.getValue();
            CardTag cardTag4 = c479150Iqf.LLILLL.LIZLLL;
            if (cardTag4 != null) {
                str6 = cardTag4.text;
            } else {
                str6 = null;
            }
            textView.setText(str6);
        }
        try {
            CardTag cardTag5 = c479150Iqf.LLILLL.LIZLLL;
            if (cardTag5 != null && (str5 = cardTag5.textColor) != null) {
                c098200Yq = Integer.valueOf(Color.parseColor(str5));
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num2 = (Integer) c098200Yq;
        if (num2 != null) {
            ((TextView) this.LLJILJIL.getValue()).setTextColor(num2.intValue());
        }
        Integer num3 = c479150Iqf.LLILLL.LJIIIIZZ;
        if (num3 != null && num3.intValue() == 1 && C500260Jjc.LJJIJIIJI(c479150Iqf.LLILLL.LJIIIZ)) {
            C439101nJ.LJI(T5());
            C12ES.LJIILL(0, (View) this.LLJ.getValue());
            List<User> list3 = c479150Iqf.LLILLL.LJ;
            if (list3 != null) {
                ArrayList<User> arrayList = new ArrayList();
                for (User user : list3) {
                    User user2 = user;
                    if (user2.getId() > 0 && (list = c479150Iqf.LLILLL.LJIIIZ) != null && list.contains(Long.valueOf(user2.getId()))) {
                        arrayList.add(user);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                for (User user3 : arrayList) {
                    if (user3 != null) {
                        avatarThumb2 = user3.getAvatarThumb();
                    } else {
                        avatarThumb2 = null;
                    }
                    arrayList2.add(avatarThumb2);
                }
                ((C446000HeI) this.LLJIJIL.getValue()).setAvatars(arrayList2);
            }
            CardTag cardTag6 = c479150Iqf.LLILLL.LJII;
            if (cardTag6 != null) {
                str2 = cardTag6.text;
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                TextView textView2 = (TextView) this.LLJI.getValue();
                CardTag cardTag7 = c479150Iqf.LLILLL.LJII;
                if (cardTag7 != null) {
                    str4 = cardTag7.text;
                } else {
                    str4 = null;
                }
                textView2.setText(str4);
            }
            try {
                CardTag cardTag8 = c479150Iqf.LLILLL.LJII;
                if (cardTag8 != null && (str3 = cardTag8.textColor) != null) {
                    c098200Yq2 = Integer.valueOf(Color.parseColor(str3));
                } else {
                    c098200Yq2 = null;
                }
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                c098200Yq2 = new C098200Yq(th3);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                obj = c098200Yq2;
            }
            Integer num4 = (Integer) obj;
            if (num4 != null) {
                ((TextView) this.LLJI.getValue()).setTextColor(num4.intValue());
            }
        } else {
            C439101nJ.LJI((View) this.LLJ.getValue());
            C12ES.LJIILL(0, T5());
            List<User> list4 = c479150Iqf.LLILLL.LJ;
            if (list4 != null) {
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list4, 10));
                for (User user4 : list4) {
                    if (user4 != null) {
                        avatarThumb = user4.getAvatarThumb();
                    } else {
                        avatarThumb = null;
                    }
                    arrayList3.add(avatarThumb);
                }
                T5().setAvatars(arrayList3);
            }
        }
        C500260Jjc.LJLIIIL(500L, W5(), new AwS373S0200000_7(this, c479150Iqf, 12));
        T5().setOnViewClickListener(new AwS408S0200000_7(this, c479150Iqf, 18));
        T5().setScrollState(false);
        T5().setOnAvatarClickListener(new AwS408S0200000_7(this, c479150Iqf, 19));
        C500260Jjc.LJLIIIL(500L, this.itemView, new AwS373S0200000_7(this, c479150Iqf, 13));
        if (TtliveHangoutEnableLiveCardAudioPlayerSetting.INSTANCE.isEnable()) {
            C500260Jjc.LJLIIIL(500L, (View) this.LLILZIL.getValue(), new AwS373S0200000_7(this, c479150Iqf, 14));
        }
    }

    public final void f6(boolean z) {
        if (z) {
            C500260Jjc.LJLJLJ(b6(), true);
            b6().animate().alpha(1.0f).setDuration(150L).setInterpolator(a6()).start();
        } else {
            b6().animate().alpha(0.0f).setDuration(150L).setInterpolator(a6()).withEndAction(new ARunnableS107S0100000_7(this, 120)).start();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        if (!TtliveHangoutEnableLiveCardAudioPlayerSetting.INSTANCE.isEnable()) {
            P5();
            i6();
        }
        super.onResume(z);
    }

    public final void q6(int i) {
        ViewGroup.LayoutParams layoutParams;
        if (i <= 0 || (layoutParams = W5().getLayoutParams()) == null || layoutParams.width == i) {
            return;
        }
        layoutParams.width = i;
        C786410Ut5.d6(W5(), layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r6(boolean z) {
        C19EG currentActivity;
        Long lValueOf;
        C479170Iqh c479170Iqh;
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment == null || !currentFragment.isAdded() || this.itemView.getParent() == null || getContext() == null || ((currentActivity = getCurrentActivity()) != null && currentActivity.isDestroyed())) {
            C20441214yg.LJ("PlayCardFeedCellV2", "updateLiveVolumeAnimator: fragment not added or view not attached or activity destroyed");
            return;
        }
        if (!TtliveHangoutEnableLiveCardAudioPlayerSetting.INSTANCE.isEnable()) {
            i6();
            return;
        }
        Long l = V5().LLILLL;
        C479150Iqf c479150Iqf = (C479150Iqf) getItem();
        if (c479150Iqf != null && (c479170Iqh = c479150Iqf.LLILLL) != null) {
            lValueOf = Long.valueOf(c479170Iqh.LIZ);
        } else {
            lValueOf = null;
        }
        if (Intrinsics.LJFF(l, lValueOf) && !V5().LLILZ && !z) {
            i6();
        } else {
            P5();
        }
    }

    public final void u6(boolean z, boolean z2) {
        int iIntValue;
        boolean zIsPlayCardFeedCellWidthAnimatorOpt = TiktokLiveHangoutPerformanceOptSetting.isPlayCardFeedCellWidthAnimatorOpt();
        if (W5().getWidth() == 0) {
            if (zIsPlayCardFeedCellWidthAnimatorOpt) {
                R5();
                if (z2 && W5().isAttachedToWindow()) {
                    HandlerHook.viewPost(W5(), new ARunnableS1S0120000_7(this, z, z2, 0));
                    return;
                }
                if (z) {
                    h6();
                    W5().setBackgroundResource(R.drawable.ck3);
                    q6(this.LLJJJJ);
                    C500260Jjc.LJLJLJ(b6(), true);
                    C786410Ut5.B5(b6(), 1.0f);
                    return;
                }
                W5().setBackgroundResource(R.drawable.cjl);
                q6(X5());
                C786410Ut5.B5(b6(), 0.0f);
                C500260Jjc.LJLJLJ(b6(), false);
                return;
            }
            if (!W5().isAttachedToWindow()) {
                return;
            }
            HandlerHook.viewPost(W5(), new ARunnableS1S0120000_7(this, z, z2, 1));
            return;
        }
        R5();
        if (z) {
            if (zIsPlayCardFeedCellWidthAnimatorOpt) {
                h6();
            } else if (this.LLJJJJ <= 0) {
                ViewGroup.LayoutParams layoutParams = W5().getLayoutParams();
                int i = layoutParams.width;
                int visibility = b6().getVisibility();
                float alpha = b6().getAlpha();
                C786410Ut5.LLLLZLL(b6(), 0);
                layoutParams.width = -2;
                C786410Ut5.d6(W5(), layoutParams);
                W5().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(W5().getHeight(), 1073741824));
                int measuredWidth = W5().getMeasuredWidth();
                int iX5 = X5();
                if (measuredWidth < iX5) {
                    measuredWidth = iX5;
                }
                this.LLJJJJ = measuredWidth;
                layoutParams.width = i;
                C786410Ut5.d6(W5(), layoutParams);
                C786410Ut5.LLLLZLL(b6(), visibility);
                C786410Ut5.B5(b6(), alpha);
            }
            int i2 = this.LLJJJJ;
            W5().setBackgroundResource(R.drawable.ck3);
            C500260Jjc.LJLJLJ(b6(), true);
            int width = W5().getWidth();
            int iX52 = X5();
            if (width < iX52) {
                width = iX52;
            }
            if (zIsPlayCardFeedCellWidthAnimatorOpt && (!z2 || width == i2)) {
                q6(i2);
                if (z2) {
                    f6(true);
                    return;
                } else {
                    C786410Ut5.B5(b6(), 1.0f);
                    return;
                }
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(width, i2);
            valueAnimatorOfInt.setDuration(150L);
            valueAnimatorOfInt.setInterpolator(a6());
            valueAnimatorOfInt.addUpdateListener(new AUListenerS76S0110000_7(this, zIsPlayCardFeedCellWidthAnimatorOpt, 1));
            ViewPropertyAnimator interpolator = b6().animate().alpha(1.0f).setDuration(150L).setInterpolator(a6());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(valueAnimatorOfInt);
            animatorSet.addListener(new ALAdapterS4S0200000_7(interpolator, this, 6));
            animatorSet.start();
            this.LLJJJJJIL = animatorSet;
            return;
        }
        int iX53 = X5();
        W5().setBackgroundResource(R.drawable.cjl);
        Integer numValueOf = Integer.valueOf(W5().getWidth());
        if (numValueOf.intValue() > 0) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = iX53;
        }
        if (zIsPlayCardFeedCellWidthAnimatorOpt && (!z2 || iIntValue == iX53)) {
            q6(iX53);
            if (z2) {
                f6(false);
                return;
            } else {
                C786410Ut5.B5(b6(), 0.0f);
                C500260Jjc.LJLJLJ(b6(), false);
                return;
            }
        }
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(iIntValue, iX53);
        valueAnimatorOfInt2.setDuration(150L);
        valueAnimatorOfInt2.setInterpolator(a6());
        valueAnimatorOfInt2.addUpdateListener(new AUListenerS76S0110000_7(this, zIsPlayCardFeedCellWidthAnimatorOpt, 2));
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = b6().animate().alpha(0.0f).setDuration(150L).setInterpolator(a6()).withEndAction(new ARunnableS107S0100000_7(this, 187));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(valueAnimatorOfInt2);
        animatorSet2.addListener(new ALAdapterS4S0200000_7(viewPropertyAnimatorWithEndAction, this, 5));
        animatorSet2.start();
        this.LLJJJJJIL = animatorSet2;
    }

    public final void w6(C479150Iqf c479150Iqf, boolean z) {
        String feedCardEnterMethodV2;
        Long lValueOf;
        String requestId;
        String strLJJLIIIJ;
        C477920Iog c477920Iog;
        String str;
        Long lValueOf2;
        String requestId2;
        String strLJJLIIIJ2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLJJIJIL >= 800) {
            this.LLJJIJIL = jCurrentTimeMillis;
            C478090Iox c478090Iox = this.LLJJIJIIJIL;
            if (c478090Iox != null) {
                c478090Iox.LJ(2000L);
            }
        }
        long j = c479150Iqf.LLILLL.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playCard clicked, roomId:");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("legolas", C2188811AlT.LIZIZ(sbLIZ));
        C479170Iqh c479170Iqh = c479150Iqf.LLILLL;
        Room room = c479170Iqh.LJFF;
        MGModuleTab mGModuleTab = c479170Iqh.LJI;
        if (mGModuleTab == null || (feedCardEnterMethodV2 = mGModuleTab.name) == null) {
            feedCardEnterMethodV2 = MultiGuestTopLiveParmasConfigSetting.INSTANCE.getFeedCardEnterMethodV2();
        }
        String str2 = null;
        if (OptimizeEnterRoomPipelineSetting.INSTANCE.enable() && room != null && room.getId() > 0) {
            C477500Io0 c477500Io0 = C477500Io0.LIZ;
            C479170Iqh c479170Iqh2 = c479150Iqf.LLILLL;
            long j2 = c479170Iqh2.LIZ;
            MGModuleTab mGModuleTab2 = c479170Iqh2.LJI;
            if (mGModuleTab2 != null) {
                lValueOf2 = Long.valueOf(mGModuleTab2.innerFeedMgAggId);
            } else {
                lValueOf2 = null;
            }
            Room room2 = c479150Iqf.LLILLL.LJFF;
            if (room2 != null) {
                requestId2 = room2.getRequestId();
            } else {
                requestId2 = null;
            }
            List<CardTag> list = c479150Iqf.LLILLL.LJIIJ;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (CardTag cardTag : list) {
                    if (cardTag.key.length() > 0) {
                        arrayList.add(cardTag);
                    }
                }
                strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS237S0000000_7.get$arr$(84), 30);
            } else {
                strLJJLIIIJ2 = null;
            }
            CardTag cardTag2 = c479150Iqf.LLILLL.LIZLLL;
            if (cardTag2 != null) {
                str2 = cardTag2.key;
            }
            C477500Io0.LJIJI(c477500Io0, j2, room, feedCardEnterMethodV2, lValueOf2, requestId2, z, new C477510Io1(strLJJLIIIJ2, str2), null, null, null, null, null, null, null, null, 32640);
        } else {
            C477500Io0 c477500Io02 = C477500Io0.LIZ;
            C479170Iqh c479170Iqh3 = c479150Iqf.LLILLL;
            long j3 = c479170Iqh3.LIZ;
            MGModuleTab mGModuleTab3 = c479170Iqh3.LJI;
            if (mGModuleTab3 != null) {
                lValueOf = Long.valueOf(mGModuleTab3.innerFeedMgAggId);
            } else {
                lValueOf = null;
            }
            Room room3 = c479150Iqf.LLILLL.LJFF;
            if (room3 != null) {
                requestId = room3.getRequestId();
            } else {
                requestId = null;
            }
            List<CardTag> list2 = c479150Iqf.LLILLL.LJIIJ;
            if (list2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (CardTag cardTag3 : list2) {
                    if (cardTag3.key.length() > 0) {
                        arrayList2.add(cardTag3);
                    }
                }
                strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, AFwS237S0000000_7.get$arr$(85), 30);
            } else {
                strLJJLIIIJ = null;
            }
            CardTag cardTag4 = c479150Iqf.LLILLL.LIZLLL;
            if (cardTag4 != null) {
                str2 = cardTag4.key;
            }
            C477500Io0.LJ(c477500Io02, j3, room, feedCardEnterMethodV2, lValueOf, requestId, z, new C477510Io1(strLJJLIIIJ, str2), 128);
        }
        Long lValueOf3 = Long.valueOf(j);
        if (lValueOf3 != null) {
            long jLongValue = lValueOf3.longValue();
            if (jLongValue > 0 && (c477920Iog = C477860Ioa.LJ) != null) {
                long j4 = c477920Iog.LIZIZ;
                if (j4 > 0 && c477920Iog.LJFF > 0) {
                    if (jLongValue == j4) {
                        str = "enter_this_room";
                    } else {
                        str = "enter_other_room";
                    }
                    C477860Ioa.LJIILJJIL(str, "PlayCardFeedCellV2#watchLive");
                }
            }
        }
    }
}
