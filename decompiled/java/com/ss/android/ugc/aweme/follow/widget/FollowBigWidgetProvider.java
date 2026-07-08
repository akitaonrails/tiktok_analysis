package com.ss.android.ugc.aweme.follow.widget;

import X.C0KZ4;
import X.C15O7;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C788530UwV;
import X.InterfaceC1106030et7;
import Y.ACallableS239S0200000_7;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class FollowBigWidgetProvider extends C0KZ4 {
    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        super.onDisabled(context);
        InterfaceC1106030et7.h7.LJFF(Boolean.FALSE);
    }

    @Override // X.C0KZ4, android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        super.onEnabled(context);
        InterfaceC1106030et7.h7.LJFF(Boolean.TRUE);
    }

    @Override // X.C0KZC, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            super.onReceive(context, intent);
            if (Intrinsics.LJFF("com.ss.android.ugc.aweme.follow.BIG_WIDGET_UPDATE", intent.getAction())) {
                C15O7.LIZIZ(new ACallableS239S0200000_7(context, this, 0), C15O7.LJI, null);
                return;
            }
            return;
        }
        C2408409cA.LIZ();
        super.onReceive(context, intent);
        if (!Intrinsics.LJFF("com.ss.android.ugc.aweme.follow.BIG_WIDGET_UPDATE", intent.getAction())) {
            return;
        }
        C15O7.LIZIZ(new ACallableS239S0200000_7(context, this, 0), C15O7.LJI, null);
    }
}
