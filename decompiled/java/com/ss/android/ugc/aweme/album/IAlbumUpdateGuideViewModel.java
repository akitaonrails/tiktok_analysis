package com.ss.android.ugc.aweme.album;

import X.C2252321DDq;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class IAlbumUpdateGuideViewModel extends AssemViewModel<InterfaceC0148002o> {
    public abstract Object AQ2(Activity activity, Uri uri, SessionInfo sessionInfo, QuoteMode quoteMode, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    public abstract void dismiss();

    public abstract void vQ2(Context context, String str);

    public abstract C2252321DDq wQ2();

    public abstract boolean xQ2();

    public abstract void yQ2(SessionInfo sessionInfo);

    public abstract void zQ2(Activity activity, SessionInfo sessionInfo);
}
