package com.ss.android.ugc.aweme.poi.detail.videolist.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C1077140e8W;
import X.C1180060goW;
import X.C1185410gx9;
import X.C1185490gxH;
import X.C1187540h0a;
import X.C1187600h0g;
import X.C1189060h32;
import X.C13IQ;
import X.C13LE;
import X.C14EU;
import X.C1843500y4a;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C427870Gq9;
import X.C452080Ho6;
import X.C452501pT;
import X.C737030Svd;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ARunnableS116S0100000_16;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes19.dex */
public class PoiVideoListItemCellFor2columns extends PowerCell<C1187600h0g> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final int LLJJJJLIIL;
    public Boolean LL;
    public SmartImageView LLILLJJLI;
    public ImageView LLILLL;
    public TuxTextView LLILZ;
    public View LLILZIL;
    public RadiusLayout LLILZLL;
    public TextView LLIZ;
    public C427870Gq9 LLIZLLLIL;
    public TuxTextView LLJ;
    public ViewGroup LLJI;
    public TuxIconView LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxIconView LLJILJILJ;
    public ViewGroup LLJILLL;
    public ViewGroup LLJJ;
    public TuxTextView LLJJI;
    public View LLJJIII;
    public TuxTextView LLJJIJI;
    public View LLJJIJIIJIL;
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1287));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1286));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1284));
    public final AssemVMLazy LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiVideoListItemCellFor2columns.class, "poiDetailHeaderVm", "getPoiDetailHeaderVm()Lcom/ss/android/ugc/aweme/poi/detail/container/PoiDetailInfoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJLIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    }

    public String N5() {
        return "post_card";
    }

    public PoiVideoListItemCellFor2columns() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailInfoViewModel.class);
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 400);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(436);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1285), awS560S0100000_16, AFwS206S0000000_18.get$arr$(351), new AwS560S0100000_16((C03K6) this, 390), new AwS560S0100000_16((C03K6) this, 392), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1289), aFwS256S0000000_18, new AwS560S0100000_16((C03K6) this, 393), null, new AwS560S0100000_16((C03K6) this, 394));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS560S0100000_16 awS560S0100000_162 = new AwS560S0100000_16((C03K6) this, 391);
            AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1288);
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18(c19719912DlLIZ, 1290);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS560S0100000_162, 71));
            AwS560S0100000_16 awS560S0100000_163 = new AwS560S0100000_16(c01gwLIZIZ, 395);
            AwS560S0100000_16 awS560S0100000_164 = new AwS560S0100000_16(c01gwLIZIZ, 396);
            AwS560S0100000_16 awS560S0100000_165 = new AwS560S0100000_16(c01gwLIZIZ, 397);
            AwS560S0100000_16 awS560S0100000_166 = new AwS560S0100000_16(c01gwLIZIZ, 398);
            AwS560S0100000_16 awS560S0100000_167 = new AwS560S0100000_16(c01gwLIZIZ, 399);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_182, awS560S0100000_16, new C452080Ho6(), awS560S0100000_163, awS560S0100000_164, awS562S0100000_18, aFwS256S0000000_18, awS560S0100000_165, awS560S0100000_166, awS560S0100000_167);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1291), awS560S0100000_16, AFwS206S0000000_18.get$arr$(352), new AwS560S0100000_16((C03K6) this, 401), new AwS560S0100000_16((C03K6) this, 402), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1292), aFwS256S0000000_18, new AwS560S0100000_16((C03K6) this, 403), null, new AwS560S0100000_16((C03K6) this, 404));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1293), awS560S0100000_16, AFwS206S0000000_18.get$arr$(353), new AwS560S0100000_16((C03K6) this, 405), new AwS560S0100000_16((C03K6) this, 387), new AwS560S0100000_16((C03K6) this, 388), aFwS256S0000000_18, null, null, new AwS560S0100000_16((C03K6) this, 389));
        }
        this.LLJJJJ = assemVMLazy;
    }

    public final PoiDetailInfoViewModel I5() {
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (PoiDetailInfoViewModel) assemVMLazy.getValue();
    }

    public final void P5() {
        Aweme aweme;
        AwemeStatistics statistics;
        Aweme aweme2;
        if (getContext() == null) {
            ViewGroup viewGroup = this.LLJI;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(8, viewGroup);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.LLJI;
        int userDigg = 0;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(0, viewGroup2);
        }
        C1187600h0g item = getItem();
        if (item != null && (aweme2 = item.LLILLJJLI) != null) {
            userDigg = aweme2.getUserDigg();
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = userDigg == 1 ? R.raw.icon_3pt_heart_filled : R.raw.icon_3pt_heart;
        c419910GdJ.LJ = userDigg == 1 ? Integer.valueOf(R.attr.a04) : Integer.valueOf(R.attr.a1k);
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        TuxIconView tuxIconView = this.LLJIJIL;
        if (tuxIconView != null) {
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        C1187600h0g item2 = getItem();
        long diggCount = (item2 == null || (aweme = item2.LLILLJJLI) == null || (statistics = aweme.getStatistics()) == null) ? 0L : statistics.getDiggCount();
        TuxTextView tuxTextView = this.LLJILJIL;
        if (tuxTextView != null) {
            tuxTextView.setText(C1843500y4a.LIZIZ(diggCount));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = (SmartImageView) this.itemView.findViewById(R.id.cover);
        this.LLILZLL = (RadiusLayout) this.itemView.findViewById(R.id.fn0);
        this.LLIZ = (TextView) this.itemView.findViewById(R.id.desc);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.video_holder_time_label);
        this.LLILZIL = this.itemView.findViewById(R.id.video_holder_tux_mask);
        this.LLILLL = (ImageView) this.itemView.findViewById(R.id.video_holder_author_verified_badge);
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.bc6);
        this.LLJ = tuxTextView;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setTextDirection(5);
        this.LLJI = (ViewGroup) this.itemView.findViewById(R.id.mn2);
        this.LLJIJIL = (TuxIconView) this.itemView.findViewById(R.id.mnw);
        this.LLJILJIL = (TuxTextView) this.itemView.findViewById(R.id.qmp);
        this.LLIZLLLIL = (C427870Gq9) this.itemView.findViewById(R.id.bbz);
        this.LLJILJILJ = (TuxIconView) this.itemView.findViewById(R.id.video_photo_mode_iv);
        this.LLJILLL = (ViewGroup) this.itemView.findViewById(R.id.r6k);
        this.LLJJ = (ViewGroup) this.itemView.findViewById(R.id.r6f);
        this.LLJJI = (TuxTextView) this.itemView.findViewById(R.id.r6j);
        this.LLJJIII = this.itemView.findViewById(R.id.r6g);
        this.LLJJIJI = (TuxTextView) this.itemView.findViewById(R.id.r6l);
        View viewFindViewById = this.itemView.findViewById(R.id.r6h);
        this.LLJJIJIIJIL = viewFindViewById;
        C1180060goW.LJIIJJI(viewFindViewById, LLJJJJLIIL);
        SmartImageView smartImageView = this.LLILLJJLI;
        if (smartImageView != null) {
            smartImageView.setOutlineProvider(new C1077140e8W(0));
            smartImageView.setClipToOutline(true);
        }
        C2211631BhB.LJ(this.itemView, new AwS595S0100000_16(this, 121));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        SmartImageView smartImageView;
        super.onViewAttachedToWindow();
        SmartImageView smartImageView2 = this.LLILLJJLI;
        if (smartImageView2 != null) {
            smartImageView2.setAttached(true);
        }
        if (Intrinsics.LJFF(this.LL, Boolean.TRUE) && (smartImageView = this.LLILLJJLI) != null) {
            smartImageView.LJI();
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        SmartImageView smartImageView;
        super.onViewDetachedFromWindow();
        SmartImageView smartImageView2 = this.LLILLJJLI;
        if (smartImageView2 != null) {
            smartImageView2.setAttached(false);
        }
        if (Intrinsics.LJFF(this.LL, Boolean.TRUE) && (smartImageView = this.LLILLJJLI) != null) {
            smartImageView.LJII();
        }
        EventBus.LIZLLL().LJJI(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x0274  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r29) {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiVideoListItemCellFor2columns.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e11, viewGroup, false);
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        HandlerHook.viewPost(this.itemView, new ARunnableS116S0100000_16(this, 257));
    }

    public void L5(C1187600h0g c1187600h0g, PoiVideoListItemCellFor2columns poiVideoListItemCellFor2columns, View view, String str, String str2, Boolean bool, C1185490gxH c1185490gxH) {
        String collectInfo;
        C1187540h0a c1187540h0a = PoiVideoListSharedViewModel.LLJJJJJIL;
        PoiListApi.PoiDetailResponse poiDetailResponse = I5().LLILLJJLI;
        String fromGroupId = null;
        if (poiDetailResponse != null) {
            collectInfo = poiDetailResponse.getCollectInfo();
        } else {
            collectInfo = null;
        }
        C1185410gx9 c1185410gx9 = (C1185410gx9) this.LLJJIJIL.getValue();
        if (c1185410gx9 != null) {
            fromGroupId = c1185410gx9.getFromGroupId();
        }
        c1187540h0a.LIZ(c1187600h0g, this, view, collectInfo, fromGroupId, bool, c1185490gxH, PageFinder.via(C1189060h32.LJIIJ(this)), c1187600h0g.LLILZIL, null);
    }
}
