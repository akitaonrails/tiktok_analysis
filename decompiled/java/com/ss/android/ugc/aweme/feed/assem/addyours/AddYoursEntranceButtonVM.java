package com.ss.android.ugc.aweme.feed.assem.addyours;

import X.C0NNI;
import X.C0NNK;
import X.C20684815ws;
import X.C817250W4d;
import X.InterfaceC0148002o;
import X.InterfaceC665370Q7z;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS158S1100000_9;
import kotlin.jvm.internal.AwS410S0200000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursEntranceButtonVM extends FeedBaseViewModel<C0NNK> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0NNK(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(com.ss.android.ugc.aweme.addyours.model.AddYoursRecommendation r25, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct> r26) {
        /*
            r24 = this;
            r3 = r26
            r5 = r25
            boolean r0 = r3 instanceof X.C0NNJ
            if (r0 == 0) goto L97
            r7 = r3
            X.0NNJ r7 = (X.C0NNJ) r7
            int r2 = r7.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L97
            int r2 = r2 - r1
            r7.LLILZLL = r2
        L16:
            java.lang.Object r8 = r7.LLILZ
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZLL
            r4 = 1
            if (r0 == 0) goto L56
            if (r0 != r4) goto La0
            X.00zU r3 = r7.LLILLL
            com.ss.android.ugc.aweme.addyours.model.AddYoursRecommendation r5 = r7.LLILLJJLI
            X.00zU r0 = r7.LL
            X.C155000ia.LIZIZ(r8)
        L2c:
            if (r8 != 0) goto L50
        L2e:
            com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct r8 = new com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct
            r9 = 0
            java.lang.String r11 = r5.getTopicText()
            r23 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r23)
            long r18 = java.lang.System.currentTimeMillis()
            java.lang.Boolean r21 = java.lang.Boolean.FALSE
            r20 = 1096810496(0x41600000, float:14.0)
            r10 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r22 = r9
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r21, r22, r23)
        L50:
            r3.element = r8
            r3 = r0
        L53:
            T r0 = r3.element
            return r0
        L56:
            X.C155000ia.LIZIZ(r8)
            X.00zU r3 = new X.00zU
            r3.<init>()
            if (r5 == 0) goto L53
            java.lang.String r0 = r5.getTopicText()
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L53
            java.lang.Long r2 = r5.getTopicId()
            if (r2 == 0) goto L95
            long r0 = r2.longValue()
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)
            boolean r0 = X.C08A4.LIZIZ(r0)
            if (r0 == 0) goto L95
            long r1 = r2.longValue()
            X.11uW r0 = X.C19651011uW.LIZIZ
            r7.LL = r3
            r7.LLILLJJLI = r5
            r7.LLILLL = r3
            r7.LLILZLL = r4
            java.lang.Object r8 = r0.LJIIL(r1, r7)
            if (r8 != r6) goto L93
            return r6
        L93:
            r0 = r3
            goto L2c
        L95:
            r0 = r3
            goto L2e
        L97:
            X.0NNJ r7 = new X.0NNJ
            r0 = r24
            r7.<init>(r0, r3)
            goto L16
        La0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonVM.vQ2(com.ss.android.ugc.aweme.addyours.model.AddYoursRecommendation, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void xQ2(VideoItemParams videoItemParams, String str) {
        C0NNI c0nni;
        String string;
        String string2;
        if (videoItemParams == null || videoItemParams.getAweme() == null || (c0nni = ((C0NNK) getState()).LL) == null || c0nni.LLILZ) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C817250W4d.LIZ("aweme_type", String.valueOf(videoItemParams.getAweme().getAwemeType()), linkedHashMap);
        C817250W4d.LIZ("group_id", videoItemParams.getAweme().getAid(), linkedHashMap);
        Long l = c0nni.LL;
        String string3 = null;
        if (l != null) {
            string = l.toString();
        } else {
            string = null;
        }
        C817250W4d.LIZ("trend_id", string, linkedHashMap);
        C817250W4d.LIZ("trend_topic", c0nni.LLILLJJLI, linkedHashMap);
        Integer num = c0nni.LLILLL;
        if (num != null) {
            string2 = num.toString();
        } else {
            string2 = null;
        }
        C817250W4d.LIZ("trend_source", string2, linkedHashMap);
        Video video = videoItemParams.getAweme().getVideo();
        if (video != null) {
            string3 = Integer.valueOf(video.getDuration()).toString();
        }
        C817250W4d.LIZ("item_duration", string3, linkedHashMap);
        C20684815ws.LJIILLIIL(str, linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void wQ2(InterfaceC665370Q7z interfaceC665370Q7z, Context context, String str, VideoItemParams videoItemParams) {
        C0NNI c0nni;
        if (videoItemParams == null || videoItemParams.getAweme() == null || (c0nni = ((C0NNK) getState()).LL) == null) {
            return;
        }
        C817250W4d.LIZIZ(context, str, new AwS410S0200000_9(videoItemParams, c0nni, 15), new AwS158S1100000_9(interfaceC665370Q7z, str, 8));
    }
}
