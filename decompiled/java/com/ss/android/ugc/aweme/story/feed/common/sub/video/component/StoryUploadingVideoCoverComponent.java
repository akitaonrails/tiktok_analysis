package com.ss.android.ugc.aweme.story.feed.common.sub.video.component;

import X.AnonymousClass0956;
import X.C0PEM;
import X.C2141308aB;
import X.C2141608aE;
import X.C2296808zG;
import X.C23250099c;
import X.C287140BNg;
import X.C729220Sj2;
import X.InterfaceC494301wD;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.collection.sub.video.component.SubVideoCoverComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryUploadingVideoCoverComponent extends SubVideoCoverComponent {
    public String LLLIIL;
    public AnonymousClass0956 LLLIILIL;
    public Aweme LLLIL;

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.video.component.SubVideoCoverComponent, com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverComponent, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1472213694) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.video.component.SubVideoCoverComponent
    public final void mp() {
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3 = this.LLLIL;
        if (aweme3 == null || !AwemeBizExtKt.isLocalUnpublishedAweme(aweme3) || (aweme = this.LLLIL) == null || aweme.getIsTikTokStory() || (aweme2 = this.LLLIL) == null || !AwemeExtKt.isPhotoMode(aweme2)) {
            super.mp();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverComponent
    public final void hp(VideoItemParams videoItemParams) {
        String scheduleId;
        Aweme aweme;
        SmartImageView smartImageView;
        super.hp(videoItemParams);
        this.LLLIL = videoItemParams.getAweme();
        Aweme aweme2 = videoItemParams.getAweme();
        if (aweme2 != null && (scheduleId = AwemeBizExtKt.getScheduleId(aweme2)) != null) {
            if (!Intrinsics.LJFF(this.LLLIIL, scheduleId)) {
                AnonymousClass0956 anonymousClass0956 = this.LLLIILIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                this.LLLIIL = scheduleId;
            }
            if (((Number) C287140BNg.LIZ.getValue()).intValue() > 1 || ((aweme = videoItemParams.getAweme()) != null && !aweme.getIsTikTokStory())) {
                C729220Sj2 c729220Sj2 = C729220Sj2.LL;
                String strLJIILLIIL = C729220Sj2.LJIILLIIL(scheduleId);
                if (strLJIILLIIL != null) {
                    this.LLLIILIL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2141308aB(strLJIILLIIL, this, null), 3);
                    return;
                }
                return;
            }
            C729220Sj2.LL.getClass();
            Bitmap bitmap = (Bitmap) ((ConcurrentHashMap) C729220Sj2.LJIIZILJ().LL.LJ.getValue()).get(scheduleId);
            if (bitmap == null || (smartImageView = this.LLJZIJLIL) == null) {
                return;
            }
            if (C2141608aE.LIZ()) {
                smartImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
            smartImageView.setImageBitmap(bitmap);
        }
    }
}
