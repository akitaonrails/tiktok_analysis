package com.bytedance.android.livesdk.impl.revenue.starcomment.manage;

import X.AbstractC21673619ry;
import X.C0JBN;
import X.C1110110ezh;
import X.C1116210f9X;
import X.C1117370fBP;
import X.C1324610kZf;
import X.C16F5;
import X.C1819620xS4;
import X.C497740JfY;
import X.C786410Ut5;
import X.InterfaceC1116290f9f;
import Y.ACListenerS83S0300000_17;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.room.LiveEndEvent;
import com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter.StarCommentViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class AudienceStarCommentManageDialog extends StarCommentManageDialog {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISg8JWEhLTMpJzo2ZjY4KDHELIOS0wJyghLCEnZigtJy40LWsNPCs6LSsvLBwnKTcPJiI+LSs4BC49KSIpDSYyJCor";
    public LiveIconView LLILZIL;
    public C16F5 LLILZLL;
    public ImageView LLIZ;
    public C16F5 LLIZLLLIL;
    public C16F5 LLJ;
    public FrameLayout LLJI;
    public int LLJIJIL = -1;
    public String LLJILJIL = "";
    public int LLJILJILJ = -1;

    public final FrameLayout PR() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.k2_) : null;
            this.LLJI = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final ImageView RR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.uo0) : null;
            this.LLIZ = (ImageView) viewFindViewById;
        }
        return (ImageView) viewFindViewById;
    }

    public final C16F5 SR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.uo_) : null;
            this.LLIZLLLIL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final C16F5 UR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.uoa) : null;
            this.LLJ = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.starcomment.manage.StarCommentManageDialog
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC1116290f9f interfaceC1116290f9f;
        StarCommentViewModel starCommentViewModelLIZ;
        MutableLiveData<List<C1116210f9X>> mutableLiveData;
        List<C1116210f9X> value;
        super.onDestroy();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (interfaceC1116290f9f = (InterfaceC1116290f9f) dataChannel.gg0(C1110110ezh.class)) == null || (starCommentViewModelLIZ = interfaceC1116290f9f.LIZ()) == null || (mutableLiveData = starCommentViewModelLIZ.LLILLL) == null || (value = mutableLiveData.getValue()) == null) {
            return;
        }
        Iterator<C1116210f9X> it2 = value.iterator();
        while (it2.hasNext()) {
            it2.next().LLJJ = false;
        }
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.starcomment.manage.StarCommentManageDialog, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.starcomment.manage.StarCommentManageDialog
    public final void OR(boolean z) {
        AbstractC21673619ry adapter = NR().getAdapter();
        if (adapter instanceof C1117370fBP) {
            C1117370fBP c1117370fBP = (C1117370fBP) adapter;
            List<?> list = c1117370fBP.LL;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if ((obj instanceof C1116210f9X) && ((C1116210f9X) obj).LLILLJJLI.getId() == UserService.getInstance().user().getCurrentUserId()) {
                    arrayList.add(obj);
                }
            }
            if (!z && arrayList.size() < this.LLJILJILJ) {
                dismiss();
            }
            this.LLJILJILJ = arrayList.size();
            if (arrayList.isEmpty()) {
                SR().setText("-");
                UR().setText("");
                C786410Ut5.LJZ(8, PR());
                dismiss();
                return;
            }
            if (arrayList.size() == 1) {
                C1116210f9X c1116210f9X = (C1116210f9X) ListProtector.get(arrayList, 0);
                SR().setText(String.valueOf(c1116210f9X.LLJILLL));
                UR().setText(C497740JfY.LJIJJ(2131844102, Long.valueOf(c1116210f9X.LIZ())));
                C786410Ut5.LJZ(8, PR());
                this.LLJIJIL = 0;
                c1116210f9X.LLJJ = true;
                this.LLJILJIL = c1116210f9X.LL;
                if (!z) {
                    return;
                }
                NR().scrollToPosition(c1117370fBP.LL.indexOf(c1116210f9X));
                return;
            }
            C786410Ut5.LJZ(0, PR());
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    Object next = it2.next();
                    if ((next instanceof C1116210f9X) && Intrinsics.LJFF(((C1116210f9X) next).LL, this.LLJILJIL)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            this.LLJIJIL = i;
            if (i < 0) {
                this.LLJIJIL = 0;
            }
            Object obj2 = ListProtector.get(arrayList, this.LLJIJIL);
            if (!(obj2 instanceof C1116210f9X)) {
                return;
            }
            C1116210f9X c1116210f9X2 = (C1116210f9X) obj2;
            UR().setText(C497740JfY.LJIJJ(2131844120, Integer.valueOf(this.LLJIJIL + 1), Integer.valueOf(arrayList.size()), Long.valueOf(c1116210f9X2.LIZ())));
            SR().setText(String.valueOf(c1116210f9X2.LLJILLL));
            c1116210f9X2.LLJJ = true;
            if (z) {
                NR().scrollToPosition(c1117370fBP.LL.indexOf(obj2));
            }
            C786410Ut5.O7(PR(), new ACListenerS83S0300000_17(adapter, arrayList, this, 3));
        }
    }

    @Override // com.bytedance.android.livesdk.impl.revenue.starcomment.manage.StarCommentManageDialog, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLILZIL;
        List urls = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.uuu);
            } else {
                viewFindViewById = null;
            }
            this.LLILZIL = (LiveIconView) viewFindViewById;
        }
        C786410Ut5.LLJJIJIL((LiveIconView) viewFindViewById, 4);
        View viewFindViewById2 = this.LLILZLL;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.sd2);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILZLL = (C16F5) viewFindViewById2;
        }
        C786410Ut5.LLJJJJ((C16F5) viewFindViewById2, 8);
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        ImageModel avatarThumb = UserService.getInstance().user().getCurrentUser().getAvatarThumb();
        if (avatarThumb != null) {
            urls = avatarThumb.getUrls();
        }
        C1324610kZf c1324610kZfLIZJ = c0jbnLIZ.LIZJ(urls);
        c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
        c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
        int width = RR().getWidth();
        int height = RR().getHeight();
        c1324610kZfLIZJ.LJ = width;
        c1324610kZfLIZJ.LJFF = height;
        c1324610kZfLIZJ.LJIIIZ = R.drawable.eze;
        c1324610kZfLIZJ.LJJI(RR());
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, LiveEndEvent.class, new AwS596S0100000_17(this, 166));
        }
    }
}
