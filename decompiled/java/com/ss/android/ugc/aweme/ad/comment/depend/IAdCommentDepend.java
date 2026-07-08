package com.ss.android.ugc.aweme.ad.comment.depend;

import X.InterfaceC1021920chS;
import X.InterfaceC988500bpY;
import android.content.Context;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.comment.widgets.NewCommentAdWidget;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes17.dex */
public interface IAdCommentDepend extends InterfaceC988500bpY {
    boolean LIZ(Context context, Aweme aweme, int i, InterfaceC1021920chS interfaceC1021920chS);

    boolean LIZIZ(Aweme aweme);

    List LIZLLL(Context context, CommentStruct commentStruct);

    void LJ(Context context, String str, String str2);

    NewCommentAdWidget LJFF(AFwS204S0000000_16 aFwS204S0000000_16);

    void LJI(Context context, Aweme aweme, String str);

    void LJII(AwemeRawAd awemeRawAd);

    void LJIIJ(Context context, LinkData linkData, Aweme aweme);

    String LJIILIIL(CommentStruct commentStruct);

    List LJIILL(Context context, CommentStruct commentStruct, Aweme aweme);

    void LJIILLIIL(Context context, User user);

    void LJIIZILJ(Context context, Aweme aweme);

    void LJIJ(Context context, String str);

    List LJIJI(Context context, CommentStruct commentStruct, AwemeRawAd awemeRawAd, AwS565S0100000_21 awS565S0100000_21);

    String LJIJJLI();

    void LJIL(Aweme aweme, String str, String str2, boolean z);

    void LJJ(Context context, String str, String str2);

    boolean LJJII(Widget widget);

    void LJJIIZI(String str, Context context, LinkData linkData, Aweme aweme, String str2);

    boolean isChattingMessageUri(String str);
}
