package com.bytedance.android.livesdk.browser.emote;

import X.C16F5;
import X.C16FV;
import X.C197039127h;
import X.C1CC2;
import X.C20689815xg;
import X.C475510Ikn;
import X.C500980Jkm;
import X.C786410Ut5;
import Y.ACListenerS165S0100000_31;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.event.SwitchCameraChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes32.dex */
public final class CropEmoteFragment extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjHELIOScjPjw2OmspJCAnLWsPOyAjDSgjPSoVOiQrJCo9PA==";
    public C20689815xg LL;
    public C16FV LLILLJJLI;
    public C16FV LLILLL;
    public C197039127h LLILZ;
    public C16F5 LLILZIL;
    public C16FV LLILZLL;
    public Uri LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public Bitmap LLJI;
    public long LLJIJIL = Long.MIN_VALUE;
    public Function2<? super String, ? super Integer, Unit> LLJILJIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final C20689815xg MR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.h13) : null;
            this.LL = (C20689815xg) viewFindViewById;
        }
        return (C20689815xg) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.ghi);
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLJIJIL == Long.MIN_VALUE) {
            return;
        }
        C1CC2.LJIIIZ(0, SystemClock.elapsedRealtime() - this.LLJIJIL, "ttlive_crop_fragment_all");
        this.LLJIJIL = Long.MIN_VALUE;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.zW(SwitchCameraChannel.class, Boolean.FALSE);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLIZ = (Uri) arguments.getParcelable("arg_origin_uri");
            this.LLIZLLLIL = arguments.getString("arg_origin_path");
            this.LLJ = arguments.getString("arg_origin_data");
            this.LLJI = (Bitmap) arguments.getParcelable("arg_origin_bitmap");
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.zW(SwitchCameraChannel.class, Boolean.TRUE);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C20689815xg c20689815xgMR = MR();
        String str = this.LLIZLLLIL;
        if (str != null) {
            c20689815xgMR.setOriginPath(str);
        } else {
            Uri uri = this.LLIZ;
            if (uri != null) {
                c20689815xgMR.setOriginUri(uri);
            } else {
                String str2 = this.LLJ;
                if (str2 != null) {
                    c20689815xgMR.setOriginData(str2);
                } else {
                    Bitmap bitmap = this.LLJI;
                    if (bitmap != null) {
                        c20689815xgMR.setOriginBitmap(bitmap);
                    }
                }
            }
        }
        View viewFindViewById = this.LLILLJJLI;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.lap);
            } else {
                viewFindViewById = null;
            }
            this.LLILLJJLI = (C16FV) viewFindViewById;
        }
        C786410Ut5.m8((C16FV) viewFindViewById, new ACListenerS165S0100000_31(this, 45));
        View viewFindViewById3 = this.LLILLL;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.lea);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLL = (C16FV) viewFindViewById3;
        }
        C786410Ut5.m8((C16FV) viewFindViewById3, new ACListenerS165S0100000_31(this, 46));
        View viewFindViewById4 = this.LLILZ;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.xfj);
            } else {
                viewFindViewById4 = null;
            }
            this.LLILZ = (C197039127h) viewFindViewById4;
        }
        ((TextView) viewFindViewById4).setText("Done");
        View viewFindViewById5 = this.LLILZIL;
        if (viewFindViewById5 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById5 = view5.findViewById(R.id.tv_reset);
            } else {
                viewFindViewById5 = null;
            }
            this.LLILZIL = (C16F5) viewFindViewById5;
        }
        C786410Ut5.l8((C16F5) viewFindViewById5, new ACListenerS165S0100000_31(this, 47));
        View viewFindViewById6 = this.LLILZ;
        if (viewFindViewById6 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById6 = view6.findViewById(R.id.xfj);
            } else {
                viewFindViewById6 = null;
            }
            this.LLILZ = (C197039127h) viewFindViewById6;
        }
        C786410Ut5.U8((C197039127h) viewFindViewById6, new ACListenerS165S0100000_31(this, 48));
        View view7 = this.LLILZLL;
        if (view7 == null) {
            View view8 = getView();
            if (view8 != null) {
                viewFindViewById2 = view8.findViewById(R.id.ltt);
            }
            this.LLILZLL = (C16FV) viewFindViewById2;
            view7 = viewFindViewById2;
        }
        C786410Ut5.m8((C16FV) view7, new ACListenerS165S0100000_31(this, 49));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        this.LLJIJIL = SystemClock.elapsedRealtime();
        super.show(fragmentManager, str);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
    }
}
