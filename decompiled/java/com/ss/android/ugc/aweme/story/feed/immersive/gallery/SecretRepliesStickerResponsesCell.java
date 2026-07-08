package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C729170Six;
import X.C730280Skk;
import X.C730340Skq;
import X.C737910Sx3;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS33S0310000_11;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class SecretRepliesStickerResponsesCell extends PowerCell<C730280Skk> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final AssemVMLazy LL;
    public RecyclerView LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SecretRepliesStickerResponsesCell.class, "viewerListVM", "getViewerListVM()Lcom/ss/android/ugc/aweme/story/feed/immersive/gallery/StoryViewerListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.fbz;
    }

    public SecretRepliesStickerResponsesCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryViewerListViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 3203);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(231);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3214), awS577S0100000_33, AFwS224S0000000_33.get$arr$(445), new AwS577S0100000_33((C03K6) this, 3189), new AwS577S0100000_33((C03K6) this, 3191), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3193), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3195), null, new AwS577S0100000_33((C03K6) this, 3196));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 3190);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3192);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 3194);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 125));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 3197);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 3198);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 3199);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 3200);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 3201);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3202), awS577S0100000_33, AFwS224S0000000_33.get$arr$(446), new AwS577S0100000_33((C03K6) this, 3204), new AwS577S0100000_33((C03K6) this, 3205), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3206), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3207), null, new AwS577S0100000_33((C03K6) this, 3208));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3209), awS577S0100000_33, AFwS224S0000000_33.get$arr$(447), new AwS577S0100000_33((C03K6) this, 3210), new AwS577S0100000_33((C03K6) this, 3211), new AwS577S0100000_33((C03K6) this, 3212), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 3213));
        }
        this.LL = assemVMLazy;
    }

    public final StoryViewerListViewModel I5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        return (StoryViewerListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = (RecyclerView) this.itemView.findViewById(R.id.twy);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C730280Skk c730280Skk = (C730280Skk) interfaceC1891350zJl;
        super.onBindItemView(c730280Skk);
        RecyclerView recyclerView = this.LLILLJJLI;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        AssemViewModel.selectSubscribe$default(I5(), C729170Six.LL, null, null, null, new AwS590S0100000_11((Function2) new AwS625S0100000_11(this, 111), 423), 14, null);
        StoryViewerListViewModel storyViewerListViewModelI5 = I5();
        storyViewerListViewModelI5.withState(new AwS33S0310000_11(storyViewerListViewModelI5, (StoryViewerListViewModel) false, (boolean) c730280Skk.LL, (List<C730340Skq>) c730280Skk.LLILLJJLI, (Aweme) 2));
    }
}
