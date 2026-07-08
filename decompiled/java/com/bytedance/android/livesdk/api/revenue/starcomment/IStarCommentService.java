package com.bytedance.android.livesdk.api.revenue.starcomment;

import X.C006A;
import X.C1116230f9Z;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.livesdk.impl.revenue.starcomment.extendscreen.StarCommentExtendWidget;
import com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes18.dex */
public interface IStarCommentService extends C006A {
    Class<? extends LiveRecyclableWidget> B52();

    String E00(DataChannel dataChannel);

    boolean J22();

    C1116230f9Z L42(Fragment fragment, DataChannel dataChannel);

    StarCommentExtendWidget RR0();

    int VC2();

    boolean ce0(Object obj);

    Pair<List<EmoteModel>, List<EmoteWithIndex>> dM2(String str);

    void initPublicScreenConfiguration();

    boolean pd0();

    StarCommentPaymentDialog xc1();

    boolean xn0();
}
