package com.ss.android.ugc.aweme.ui.feed.collection;

import X.C0ST8;
import X.C1558520qew;
import X.C337180DJs;
import X.C716660S9g;
import X.C724270Sb3;
import X.C729980SkG;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import com.ss.android.ugc.aweme.ability.IPhotoNumIndicatorAbility;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.CleanModeProtocol;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoNumIndicatorAssem;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoNumIndicatorInCollectionAssem extends PhotoNumIndicatorAssem implements IPhotoNumIndicatorAbility, CleanModeProtocol, InterfaceC1554640qYg {
    @Override // com.ss.android.ugc.aweme.feed.collection.common.protocol.CleanModeProtocol
    public final String BB1() {
        return "photo_indicator_tag";
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1566998288) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoNumIndicatorAbility
    public final void Mx0() {
        C337180DJs.LIZ(this.LLJL);
    }

    @Override // com.ss.android.ugc.aweme.ability.IPhotoNumIndicatorAbility
    public final void Rm1() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (C0ST8.LIZJ(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme()) > 1) {
            C337180DJs.LIZJ(this.LLJL);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.protocol.CleanModeProtocol
    public final void Iu0() {
        Rm1();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.protocol.CleanModeProtocol
    public final void Lv() {
        Mx0();
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoNumIndicatorAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoNumIndicatorAssem
    /* JADX INFO: renamed from: zp */
    public final void up(VideoItemParams videoItemParams) {
        super.up(videoItemParams);
        if (C0ST8.LIZJ(videoItemParams.getAweme()) <= 1 || (AwemeExtKt.getFollowStatus(videoItemParams.getAweme()) == 0 && !C729980SkG.LJIIIIZZ(videoItemParams.getAweme()))) {
            C716660S9g c716660S9g = this.LLJL;
            if (c716660S9g != null) {
                C337180DJs.LIZ(c716660S9g);
                return;
            }
            return;
        }
        C716660S9g c716660S9g2 = this.LLJL;
        if (c716660S9g2 == null) {
            return;
        }
        C337180DJs.LIZJ(c716660S9g2);
    }
}
