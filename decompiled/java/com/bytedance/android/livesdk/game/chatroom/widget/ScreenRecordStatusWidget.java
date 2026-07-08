package com.bytedance.android.livesdk.game.chatroom.widget;

import X.C011Z;
import X.C0KQH;
import X.C0UOJ;
import X.C12ES;
import X.C1697810uHb;
import X.C16F5;
import X.C1CC2;
import X.C439101nJ;
import X.C497740JfY;
import X.C786410Ut5;
import Y.ACListenerS55S1200000_12;
import Y.ARunnableS112S0100000_12;
import Y.AcS110S1100000_12;
import Y.AcS29S2100000_12;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.game.chatroom.widget.ScreenRecordStatusWidget;
import com.bytedance.android.livesdk.livesetting.game.EnableGameBroadcastFrameSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class ScreenRecordStatusWidget extends LiveRecyclableWidget {
    public final Room LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final Function0<Unit> LLILZIL;
    public C16F5 LLILZLL;
    public C16F5 LLIZ;
    public TextView LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;

    public ScreenRecordStatusWidget() {
        throw null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return (EnableGameBroadcastFrameSetting.INSTANCE.enable() && this.LLILZ) ? R.layout.g1y : R.layout.g1x;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (this.LLJ || !this.LLJI) {
            return;
        }
        super.show();
        View view = this.contentView;
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS112S0100000_12(this, 137));
        }
    }

    public final void y1() {
        if (!EnableGameBroadcastFrameSetting.INSTANCE.enable()) {
            C16F5 c16f5 = this.LLIZ;
            if (c16f5 == null) {
                c16f5 = null;
            }
            c16f5.setText(C497740JfY.LJIJI(2131842945));
        }
        C16F5 c16f52 = this.LLIZ;
        if (c16f52 == null) {
            c16f52 = null;
        }
        C12ES.LJIILL(0, c16f52);
        C16F5 c16f53 = this.LLILZLL;
        if (c16f53 == null) {
            c16f53 = null;
        }
        C439101nJ.LJI(c16f53);
        TextView textView = this.LLIZLLLIL;
        C439101nJ.LJI(textView != null ? textView : null);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        String string;
        Resources resources;
        String[] strArr = new String[1];
        View view = getView();
        if (view == null || (resources = view.getResources()) == null || (string = resources.getString(2131843910)) == null) {
            string = "";
        }
        strArr[0] = string;
        C1697810uHb.LJ(strArr);
        this.LLILZLL = (C16F5) findViewById(R.id.y3o);
        this.LLIZ = (C16F5) findViewById(R.id.ex3);
        this.LLIZLLLIL = (TextView) findViewById(R.id.vyc);
        this.dataChannel.BQ2(this, PauseLiveChannel.class, new AwS591S0100000_12(this, 564));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047 A[PHI: r2
      0x0047: PHI (r2v23 java.lang.String) = (r2v4 java.lang.String), (r2v24 java.lang.String) binds: [B:19:0x0045, B:17:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLoad(java.lang.Object[] r14) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.chatroom.widget.ScreenRecordStatusWidget.onLoad(java.lang.Object[]):void");
    }

    public static void x1(int i, String str) {
        int i2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("pack_name", str);
        }
        if (i != 0) {
            linkedHashMap.put("error_type", Integer.valueOf(i));
        }
        String strLIZ = C0KQH.LIZ("livesdk_screen_record_open_game");
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        C1CC2.LJII(i2, strLIZ, linkedHashMap);
    }

    public final void z1(final String str, final String str2) {
        boolean z;
        TextView textView = this.LLIZLLLIL;
        if (textView == null) {
            textView = null;
        }
        if (str2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C786410Ut5.LLIL(textView, 0);
            textView.setEnabled(true);
            if (str.length() > 0) {
                try {
                    if (C786410Ut5.Y3(C497740JfY.LJII().getPackageManager(), str, 0) != null && (!C0UOJ.LIZ(16, C0UOJ.LIZIZ, false) || this.LLILZ)) {
                        textView.setText(textView.getContext().getString(2131841815, str2));
                        C786410Ut5.T7(textView, new View.OnClickListener() { // from class: X.0Uhj
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Long lValueOf;
                                ScreenRecordStatusWidget screenRecordStatusWidget = this.LL;
                                String str3 = str;
                                String str4 = str2;
                                screenRecordStatusWidget.getClass();
                                C782110Um9 c782110Um9 = new C782110Um9(screenRecordStatusWidget.context);
                                c782110Um9.LIZIZ = screenRecordStatusWidget;
                                int i = 1;
                                c782110Um9.LIZJ = C786410Ut5.j4(screenRecordStatusWidget.context.getString(2131841813), Arrays.copyOf(new Object[]{str4}, 1));
                                c782110Um9.LJIIIZ(C786410Ut5.j4(screenRecordStatusWidget.context.getString(2131841814), Arrays.copyOf(new Object[]{str4}, 1)));
                                c782110Um9.LJIIJ(2131841087, new AcS110S1100000_12(screenRecordStatusWidget, str3, 4));
                                c782110Um9.LJIILIIL(2131842878, new AcS29S2100000_12(screenRecordStatusWidget, str3, str4, 1));
                                C786410Ut5.E4(c782110Um9.LIZ());
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_auto_switch_game_click");
                                c474500IjALIZ.LJJ("screen_share");
                                c474500IjALIZ.LJII(this.LL.LLILLJJLI);
                                Room room = this.LL.LL;
                                if (room != null) {
                                    lValueOf = Long.valueOf(room.getId());
                                } else {
                                    lValueOf = null;
                                }
                                c474500IjALIZ.LJJIJIIJI(lValueOf);
                                if (this.LL.LLILZIL != null) {
                                    i = 0;
                                }
                                c474500IjALIZ.LJJII(Integer.valueOf(i), "is_live");
                                c474500IjALIZ.LJJII("entrance", "position");
                                c474500IjALIZ.LIZ();
                            }
                        });
                        return;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (this.LLILZIL != null) {
                textView.setText(textView.getContext().getString(2131843093));
                C786410Ut5.T7(textView, new ACListenerS55S1200000_12(this, textView, str2, 0));
                return;
            } else {
                C786410Ut5.LLIL(textView, 8);
                return;
            }
        }
        C786410Ut5.LLIL(textView, 8);
    }

    public ScreenRecordStatusWidget(Room room, String str, boolean z, boolean z2, Function0 function0, int i) {
        z = (i & 4) != 0 ? false : z;
        z2 = (i & 8) != 0 ? false : z2;
        function0 = (i & 16) != 0 ? null : function0;
        this.LL = room;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = function0;
        new ArrayList();
        this.LLJI = true;
    }
}
