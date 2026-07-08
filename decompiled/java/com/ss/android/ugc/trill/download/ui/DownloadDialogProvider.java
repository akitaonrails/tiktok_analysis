package com.ss.android.ugc.trill.download.ui;

import X.AlertDialogC1377870lxZ;
import X.C0TBO;
import X.C1233040iBy;
import X.C1388190mED;
import X.C1C7U;
import X.C20684815ws;
import X.C2214201BlK;
import X.C2344009Gk;
import X.C294850Bh5;
import X.C726220SeC;
import X.C785410UrT;
import X.C786410Ut5;
import X.C816490W1f;
import X.InterfaceC1375480lti;
import X.InterfaceC21168617si;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.SoftReference;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class DownloadDialogProvider implements InterfaceC21168617si {
    public final String LIZ;
    public final String LIZIZ;
    public final Aweme LIZJ;
    public Context LIZLLL;
    public AlertDialogC1377870lxZ LJ;
    public boolean LJFF;
    public final DownloadDialogProvider$handler$1 LJI;

    public final void LIZIZ() {
        Activity activityLIZ;
        this.LJFF = true;
        Context context = this.LIZLLL;
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null || !(activityLIZ.isFinishing() || activityLIZ.isDestroyed())) {
            AlertDialogC1377870lxZ alertDialogC1377870lxZ = this.LJ;
            if (alertDialogC1377870lxZ != null && alertDialogC1377870lxZ.isShowing()) {
                alertDialogC1377870lxZ.dismiss();
                C785410UrT.LIZ(alertDialogC1377870lxZ);
            }
            if (hasMessages(1)) {
                removeMessages(1);
            }
        }
    }

    @Override // X.InterfaceC21168617si
    public final void onCancel() {
        LIZIZ();
    }

    @Override // X.InterfaceC21168617si
    public final void onSuccess() {
        LIZIZ();
    }

    @Override // X.InterfaceC21168617si
    public final void LIZ(Context context) {
        if (this.LJ == null) {
            this.LIZLLL = context;
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                C726220SeC c726220SeC = C726220SeC.LIZIZ;
                if (c726220SeC.LIZ(activityLIZ)) {
                    Activity activityLJFF = C2214201BlK.LJFF();
                    if (activityLJFF != null && !c726220SeC.LIZ(activityLJFF)) {
                        LIZJ(activityLJFF);
                    } else {
                        C0TBO.LIZ(new AwS565S0100000_21(this, 1593));
                    }
                } else {
                    LIZJ(activityLIZ);
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", this.LIZ);
                c2344009Gk.LIZJ(0, "is_long_item");
                c2344009Gk.LJIIIIZZ("group_id", this.LIZJ.getGroupId());
                c2344009Gk.LJIIIIZZ("download_method", this.LIZIZ);
                C20684815ws.LJIILLIIL("download_process_popup_show", c2344009Gk.LIZ);
            }
        }
        AlertDialogC1377870lxZ alertDialogC1377870lxZ = this.LJ;
        if (alertDialogC1377870lxZ != null) {
            alertDialogC1377870lxZ.LIZJ(0);
        }
        C786410Ut5.LJLJJI(1, 20000L, this.LJI);
    }

    public final void LIZJ(Activity activity) {
        String string;
        if (C294850Bh5.LIZ()) {
            string = activity.getString(2131825054);
        } else {
            string = activity.getResources().getString(2131846827);
        }
        AlertDialogC1377870lxZ alertDialogC1377870lxZLIZLLL = AlertDialogC1377870lxZ.LIZLLL(activity, string);
        this.LJ = alertDialogC1377870lxZLIZLLL;
        if (!alertDialogC1377870lxZLIZLLL.isShowing() && !activity.isFinishing()) {
            alertDialogC1377870lxZLIZLLL.show();
            C785410UrT.LIZIZ(alertDialogC1377870lxZLIZLLL);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(alertDialogC1377870lxZLIZLLL);
            C816490W1f.LIZ(alertDialogC1377870lxZLIZLLL);
        }
        this.LIZLLL = activity;
    }

    @Override // X.InterfaceC21168617si
    public final void onFailed(int i) {
        LIZIZ();
        if (i == -113) {
            C1233040iBy c1233040iBy = new C1233040iBy(this.LIZLLL);
            c1233040iBy.LIZIZ(2131847879);
            c1233040iBy.LIZLLL();
        } else {
            C1233040iBy c1233040iBy2 = new C1233040iBy(this.LIZLLL);
            c1233040iBy2.LIZIZ(2131846828);
            c1233040iBy2.LIZLLL();
        }
    }

    @Override // X.InterfaceC21168617si
    public final void onProgress(int i) {
        Message message = new Message();
        message.what = 2;
        message.obj = Integer.valueOf(i);
        C786410Ut5.LJLJJL(this.LJI, message);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ss.android.ugc.trill.download.ui.DownloadDialogProvider$handler$1] */
    public DownloadDialogProvider(String str, String str2, Aweme aweme) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = aweme;
        final Looper mainLooper = Looper.getMainLooper();
        this.LJI = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.trill.download.ui.DownloadDialogProvider$handler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                float f;
                int iIntValue;
                Integer num;
                C1C7U.LIZ("DownloadDialogProvider@8a85.handler$1");
                int i = message.what;
                if (i != 1) {
                    if (i == 2) {
                        Object messageObj = HandlerHook.getMessageObj(message.obj);
                        if ((messageObj instanceof Integer) && (num = (Integer) messageObj) != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        AlertDialogC1377870lxZ alertDialogC1377870lxZ = this.LL.LJ;
                        if (alertDialogC1377870lxZ != null && alertDialogC1377870lxZ.isShowing()) {
                            alertDialogC1377870lxZ.LIZJ(iIntValue);
                        }
                    }
                } else {
                    DownloadDialogProvider downloadDialogProvider = this.LL;
                    AlertDialogC1377870lxZ alertDialogC1377870lxZ2 = downloadDialogProvider.LJ;
                    if (alertDialogC1377870lxZ2 != null && alertDialogC1377870lxZ2.isShowing()) {
                        alertDialogC1377870lxZ2.LIZIZ();
                        Context context = downloadDialogProvider.LIZLLL;
                        if (context != null) {
                            f = (240.0f * context.getResources().getDisplayMetrics().density) + 0.5f;
                        } else {
                            f = 0.0f;
                        }
                        alertDialogC1377870lxZ2.LJ((int) f, downloadDialogProvider.LIZLLL);
                        alertDialogC1377870lxZ2.LLJI = new InterfaceC1375480lti() { // from class: X.0lrk
                            @Override // X.InterfaceC1375480lti
                            public final void LIZ() {
                                InterfaceC21170217sy<?> interfaceC21170217sy;
                                C21169617ss.LIZ.getClass();
                                SoftReference<InterfaceC21170217sy<?>> softReference = C21169817su.LJII;
                                if (softReference != null && (interfaceC21170217sy = softReference.get()) != null) {
                                    interfaceC21170217sy.cancel();
                                }
                                SoftReference<InterfaceC21170217sy<?>> softReference2 = C21169817su.LJII;
                                if (softReference2 != null) {
                                    softReference2.clear();
                                }
                                C21169817su.LJII = null;
                            }
                        };
                    }
                }
                C1C7U.LIZIZ("DownloadDialogProvider@8a85.handler$1");
            }
        };
    }
}
