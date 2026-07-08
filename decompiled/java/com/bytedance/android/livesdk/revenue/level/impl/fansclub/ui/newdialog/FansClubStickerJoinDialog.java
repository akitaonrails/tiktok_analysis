package com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog;

import X.C0TZM;
import X.C1143680frq;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C13LP;
import X.C1819620xS4;
import X.C19ME;
import X.C497740JfY;
import X.C500980Jkm;
import X.C786410Ut5;
import Y.AObserverS221S0100000_17;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.level.FansClubPrivilegeConfigSetting;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.JoinDialogViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes18.dex */
public class FansClubStickerJoinDialog extends AbsNewFansClubJoinDialog {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OiA6LCEmLWsgLDk2JGslJD8/HELIOSZiMtJzwwJDAuZzo6ZispPis6KSkjLmEVKSs/CiMmKhY4ICw4LTcGJiY9DCwtJSA0";
    public TextView LLJJLIIIJLLLLLLLZ;
    public ImageModel LLJL;
    public String LLJLIL;

    public FansClubStickerJoinDialog() {
        this(false);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        int i = (dataChannel == null || (bool = (Boolean) dataChannel.gg0(C0TZM.class)) == null || bool.booleanValue()) ? R.style.aid : R.style.ain;
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g6a);
        c500980Jkm.LIZJ = i;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJIILIIL = 48;
        c500980Jkm.LJII = 80;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.AbsNewFansClubJoinDialog
    public final void OR() {
        MutableLiveData<String> mutableLiveData;
        super.OR();
        JoinDialogViewModel joinDialogViewModel = this.LLILLL;
        if (joinDialogViewModel == null || (mutableLiveData = joinDialogViewModel.LLILZLL) == null) {
            return;
        }
        mutableLiveData.observe(this, new AObserverS221S0100000_17(this, 27));
    }

    @Override // com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.AbsNewFansClubJoinDialog, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    public FansClubStickerJoinDialog(boolean z) {
        super(z);
        this.LLJLIL = "";
    }

    @Override // com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.AbsNewFansClubJoinDialog
    public final void NR(View view) {
        boolean zLJJJJ;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        List<String> list;
        ImageView imageView = (ImageView) view.findViewById(R.id.lvx);
        C1324720kZq c1324720kZq = (C1324720kZq) view.findViewById(R.id.lvy);
        int iLJIIZILJ = C497740JfY.LJIIZILJ();
        float fLJIIIZ = (iLJIIZILJ * 1.0f) / C497740JfY.LJIIIZ(R.dimen.arq);
        float fLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.arp) * fLJIIIZ;
        float fLJIIIZ3 = fLJIIIZ * C497740JfY.LJIIIZ(R.dimen.aru);
        String str = this.LLJLIL;
        int iLJIIIZ = 0;
        if (str != null && !a0.LJJJIL(str) && (list = FansClubPrivilegeConfigSetting.INSTANCE.getValue().defaultStickerIds) != null) {
            zLJJJJ = C13LP.LJJJJ(this.LLJLIL, list);
        } else {
            zLJJJJ = false;
        }
        ViewGroup.LayoutParams layoutParams2 = null;
        if (imageView != null) {
            layoutParams = imageView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof C19ME) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams2.width = iLJIIZILJ;
            marginLayoutParams2.height = (int) fLJIIIZ2;
            C786410Ut5.c6(imageView, marginLayoutParams2);
        }
        if (c1324720kZq != null) {
            layoutParams2 = c1324720kZq.getLayoutParams();
        }
        if ((layoutParams2 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            int i = (int) fLJIIIZ3;
            marginLayoutParams.width = i;
            marginLayoutParams.height = i;
            if (!zLJJJJ) {
                iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.arr);
            }
            C786410Ut5.u6(c1324720kZq, marginLayoutParams);
        }
        C1143680frq.LJ(imageView, "tiktok_live_fans_club_join_dialog", "ttlive_icon_new_fans_club_dialog_sticker_badge.png", ImageView.ScaleType.FIT_XY);
        if (this.LLJL == null) {
            return;
        }
        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(this.LLJL);
        c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.FIT_XY;
        c1324610kZfLJIIIZ.LJIIIZ = R.drawable.eze;
        c1324610kZfLJIIIZ.LJIJI(Float.valueOf(iLJIIIZ));
        c1324610kZfLJIIIZ.LJJI(c1324720kZq);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.AbsNewFansClubJoinDialog
    public final void PR(View view) {
        super.PR(view);
        this.LLJJLIIIJLLLLLLLZ = (TextView) view.findViewById(R.id.zll);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.AbsNewFansClubJoinDialog, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        SR();
    }
}
