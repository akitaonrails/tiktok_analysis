package com.ss.android.ugc.aweme.im.messagelist.api.ability;

import X.C06NM;
import X.C0I5R;
import X.C869590Y9l;
import X.InterfaceC494301wD;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.im.message.content.CommentContent;
import com.ss.android.ugc.aweme.im.message.content.FeatureAttachmentContent;
import com.ss.android.ugc.aweme.im.message.content.GifContent;
import com.ss.android.ugc.aweme.im.message.content.GroupInviteCardContent;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveContent;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveEventContent;
import com.ss.android.ugc.aweme.im.message.content.ShareMusicContent;
import com.ss.android.ugc.aweme.im.message.content.ShareProductContent;
import com.ss.android.ugc.aweme.im.message.content.ShareUserContent;

/* JADX INFO: loaded from: classes7.dex */
public interface MessageListQuotedMessageClickAbility extends InterfaceC494301wD {
    void ED1(View view, long j, Long l);

    void EL2(View view, long j, Long l, GifContent gifContent);

    void G10(C869590Y9l c869590Y9l, GroupInviteCardContent groupInviteCardContent);

    void KZ0(long j, Long l, long j2, long j3);

    void OI2(View view, C869590Y9l c869590Y9l, CommentContent commentContent);

    void Qz0(ShareUserContent shareUserContent);

    void RK(View view, long j, Long l, String str);

    void S52(Context context, C869590Y9l c869590Y9l, String str, String str2);

    void TQ0(View view, long j, Long l, String str);

    void UZ0(View view, long j, Long l, String str);

    void W32(View view, long j, Long l, ShareLiveContent shareLiveContent);

    void Zb1(Context context, String str, FeatureAttachmentContent featureAttachmentContent);

    void kn0(View view, long j, Long l);

    void lC1(View view, long j, Long l, C0I5R c0i5r);

    void lU1(long j);

    void mV1(long j, Long l);

    void oQ2(View view, C869590Y9l c869590Y9l, ShareLiveEventContent shareLiveEventContent);

    void q01(ShareMusicContent shareMusicContent);

    void qQ2(View view, C869590Y9l c869590Y9l, ShareProductContent shareProductContent);

    void v10(View view, long j, Long l, C06NM c06nm);

    void wz0(long j, Long l, Context context, int i, C0I5R c0i5r);
}
