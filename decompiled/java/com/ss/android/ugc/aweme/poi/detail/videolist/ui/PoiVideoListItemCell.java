package com.ss.android.ugc.aweme.poi.detail.videolist.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0M3E;
import X.C0QVF;
import X.C1170350gYr;
import X.C1180600gpO;
import X.C1181430gqj;
import X.C1181890grT;
import X.C1185410gx9;
import X.C1187600h0g;
import X.C1189060h32;
import X.C1189360h3W;
import X.C1202680hP0;
import X.C13LE;
import X.C1620160sGM;
import X.C19719912Dl;
import X.C1EE2;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C438710HIf;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1184330gvP;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS121S0200000_18;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.localservice.experiment.SlashComponentUIPreloadExp;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.experiment.PoiServerConfigSettings;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiVideoListItemCell extends PowerCell<C1187600h0g> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public SmartImageView LL;
    public C0M3E LLILLJJLI;
    public Boolean LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1260));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1259));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1256));
    public final AssemVMLazy LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiVideoListItemCell.class, "poiDetailHeaderVm", "getPoiDetailHeaderVm()Lcom/ss/android/ugc/aweme/poi/detail/container/PoiDetailInfoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiVideoListItemCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiDetailInfoViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 1275);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(435);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1258), awS562S0100000_18, AFwS206S0000000_18.get$arr$(348), new AwS562S0100000_18((C03K6) this, 1261), new AwS562S0100000_18((C03K6) this, 1263), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1265), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1267), null, new AwS562S0100000_18((C03K6) this, 1268));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS562S0100000_18 awS562S0100000_182 = new AwS562S0100000_18((C03K6) this, 1262);
            AwS562S0100000_18 awS562S0100000_183 = new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1264);
            AwS562S0100000_18 awS562S0100000_184 = new AwS562S0100000_18(c19719912DlLIZ, 1266);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS419S0200000_18((InterfaceC451590HnJ) obj, awS562S0100000_182, 70));
            AwS562S0100000_18 awS562S0100000_185 = new AwS562S0100000_18(c01gwLIZIZ, 1269);
            AwS562S0100000_18 awS562S0100000_186 = new AwS562S0100000_18(c01gwLIZIZ, 1270);
            AwS562S0100000_18 awS562S0100000_187 = new AwS562S0100000_18(c01gwLIZIZ, 1271);
            AwS562S0100000_18 awS562S0100000_188 = new AwS562S0100000_18(c01gwLIZIZ, 1272);
            AwS562S0100000_18 awS562S0100000_189 = new AwS562S0100000_18(c01gwLIZIZ, 1273);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS562S0100000_184, awS562S0100000_18, new C452080Ho6(), awS562S0100000_185, awS562S0100000_186, awS562S0100000_183, aFwS256S0000000_18, awS562S0100000_187, awS562S0100000_188, awS562S0100000_189);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1274), awS562S0100000_18, AFwS206S0000000_18.get$arr$(349), new AwS562S0100000_18((C03K6) this, 1276), new AwS562S0100000_18((C03K6) this, 1277), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 1278), aFwS256S0000000_18, new AwS562S0100000_18((C03K6) this, 1279), null, new AwS562S0100000_18((C03K6) this, 1280));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS562S0100000_18(c19719912DlLIZ, 1281), awS562S0100000_18, AFwS206S0000000_18.get$arr$(350), new AwS562S0100000_18((C03K6) this, 1282), new AwS562S0100000_18((C03K6) this, 1283), new AwS562S0100000_18((C03K6) this, 1255), aFwS256S0000000_18, null, null, new AwS562S0100000_18((C03K6) this, 1257));
        }
        this.LLIZ = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (SmartImageView) this.itemView.findViewById(R.id.cover);
        this.LLILLJJLI = C1EE2.LIZIZ.LJIIJJI((ViewGroup) this.itemView.findViewById(R.id.xus));
        C2211631BhB.LJ(this.itemView, new AwS597S0100000_18(this, 377));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        SmartImageView smartImageView;
        super.onViewAttachedToWindow();
        SmartImageView smartImageView2 = this.LL;
        if (smartImageView2 != null) {
            smartImageView2.setAttached(true);
        }
        if (!Intrinsics.LJFF(this.LLILLL, Boolean.TRUE) || (smartImageView = this.LL) == null) {
            return;
        }
        smartImageView.LJI();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        SmartImageView smartImageView;
        super.onViewDetachedFromWindow();
        SmartImageView smartImageView2 = this.LL;
        if (smartImageView2 != null) {
            smartImageView2.setAttached(false);
        }
        if (!Intrinsics.LJFF(this.LLILLL, Boolean.TRUE) || (smartImageView = this.LL) == null) {
            return;
        }
        smartImageView.LJII();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        Aweme aweme;
        Video video;
        SmartImageView smartImageView;
        String poiId;
        Boolean haveRegionDiscovery;
        C1187600h0g c1187600h0g = (C1187600h0g) interfaceC1891350zJl;
        if (this.LLILLL == null) {
            PoiListApi.PoiDetailResponse poiDetailResponseLIZ = C1181890grT.LIZ(C1189060h32.LJIIJ(this));
            boolean z = false;
            if (poiDetailResponseLIZ == null || (haveRegionDiscovery = poiDetailResponseLIZ.getHaveRegionDiscovery()) == null || !haveRegionDiscovery.booleanValue() || !PoiServerConfigSettings.LIZIZ()) {
                z = true;
            }
            this.LLILLL = Boolean.valueOf(z);
        }
        C786410Ut5.I7(new ACListenerS121S0200000_18(c1187600h0g, this, 71), this.itemView);
        String desc = c1187600h0g.LLILLJJLI.getDesc();
        if (desc == null) {
            desc = "";
        }
        C0QVF.LIZ(this.itemView, 3, desc, new ACListenerS121S0200000_18(c1187600h0g, this, 72), 4);
        C0M3E c0m3e = this.LLILLJJLI;
        if (c0m3e != null) {
            c0m3e.LJ(c1187600h0g.LLILLJJLI);
        }
        C1187600h0g item = getItem();
        if (item != null && (aweme = item.LLILLJJLI) != null && (video = aweme.getVideo()) != null && (smartImageView = this.LL) != null) {
            Boolean bool = this.LLILLL;
            Boolean bool2 = Boolean.TRUE;
            if (C1620160sGM.LIZLLL(smartImageView, video, "PoiVideoListItem", Intrinsics.LJFF(bool, bool2), false, 240)) {
                smartImageView.setAttached(true);
                if (Intrinsics.LJFF(this.LLILLL, bool2)) {
                    smartImageView.LJI();
                    return;
                }
                return;
            }
            C1185410gx9 c1185410gx9Nf = ((InterfaceC1184330gvP) C1170350gYr.LIZIZ(this, C13LE.LIZ(InterfaceC1184330gvP.class))).Nf();
            if (c1185410gx9Nf != null) {
                poiId = c1185410gx9Nf.getPoiId();
            } else {
                poiId = null;
            }
            C1180600gpO c1180600gpO = new C1180600gpO("poi_detail", "video_three_col", null);
            c1180600gpO.LIZLLL = new C1202680hP0(poiId, null, null, null, null, 30);
            C1189360h3W c1189360h3WLIZ = c1180600gpO.LIZ(C438710HIf.LIZ(video.getCover()));
            c1189360h3WLIZ.LIZLLL(smartImageView);
            c1189360h3WLIZ.LIZIZ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        if (!SlashComponentUIPreloadExp.LIZ("poi_merged_list") && !SlashComponentUIPreloadExp.LIZ("poi_video_list")) {
            return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.e40, viewGroup, false);
        }
        return C1181430gqj.LIZIZ(viewGroup.getContext(), R.layout.e40, viewGroup, false);
    }
}
