package com.ss.android.ugc.aweme.commerce.tools.music.viewmodel;

import X.C01GW;
import X.C09R3;
import X.C13LE;
import X.C15MY;
import X.C2217381BqS;
import X.C452501pT;
import X.C997320c3m;
import X.InterfaceC1010530cP5;
import X.InterfaceC2217461Bqa;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class CommerceMusicLegalViewModel extends ViewModel implements InterfaceC1010530cP5<C15MY> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C15MY LL;
    public boolean LLILZIL;
    public final boolean LLJI;
    public final C997320c3m LLILLJJLI = new C997320c3m(AFwS276S0000000_31.get$arr$(61));
    public final C997320c3m LLILLL = new C997320c3m(AFwS276S0000000_31.get$arr$(62));
    public final C997320c3m LLILZ = new C997320c3m(AFwS276S0000000_31.get$arr$(63));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 400));
    public final C997320c3m LLIZ = new C997320c3m(AFwS276S0000000_31.get$arr$(64));
    public final MutableLiveData<Boolean> LLIZLLLIL = new MutableLiveData<>(Boolean.FALSE);
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 341));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommerceMusicLegalViewModel.class, "hasBrandedContent", "getHasBrandedContent()Landroidx/lifecycle/MutableLiveData;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CommerceMusicLegalViewModel.class, "hasECommerceAnchor", "getHasECommerceAnchor()Landroidx/lifecycle/MutableLiveData;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(CommerceMusicLegalViewModel.class, "isSellerAccount", "isSellerAccount()Landroidx/lifecycle/MutableLiveData;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(CommerceMusicLegalViewModel.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    public final VideoPublishEditModel vQ2() {
        C997320c3m c997320c3m = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (VideoPublishEditModel) c997320c3m.LIZ(this);
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ C15MY Mh() {
        return this.LL;
    }

    public CommerceMusicLegalViewModel(C15MY c15my) {
        AVMusic aVMusicExtractAVMusic;
        this.LL = c15my;
        boolean z = true;
        if (!vQ2().realHasOriginalSound() && (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(vQ2().creativeModel.musicBuzModel)) != null && !aVMusicExtractAVMusic.isOriginalSound()) {
            z = false;
        }
        this.LLJI = z;
    }
}
