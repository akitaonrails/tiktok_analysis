package com.bytedance.android.livesdk.interaction.poll.ui;

import X.C1086690eNv;
import X.C1324570kZb;
import X.C1324720kZq;
import X.C20744116Fj;
import X.C497740JfY;
import X.C500980Jkm;
import X.C786410Ut5;
import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.SelectPollViewModel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftPollWarnDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISs4LDHELIOS0yKzElJiF9OCogJWEmIWsLICknGCogJRgyOisIIC4/JyI=";
    public Gift LL;
    public Function0<Unit> LLILLJJLI;
    public SelectPollViewModel LLILLL;
    public C20744116Fj LLILZ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g7_);
        c500980Jkm.LJII = 17;
        c500980Jkm.LJIIIZ = C497740JfY.LJIIIZ(R.dimen.aqd);
        c500980Jkm.LJIIJ = -2;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismissAllowingStateLoss() {
        NextLiveData<Throwable> nextLiveDataVQ2;
        super.dismissAllowingStateLoss();
        DataChannel dataChannel = this.dataChannel;
        C20744116Fj c20744116Fj = this.LLILZ;
        boolean zIsChecked = c20744116Fj != null ? c20744116Fj.isChecked() : false;
        Gift gift = this.LL;
        C1086690eNv.LIZJ(gift != null ? gift.id : 0L, dataChannel, "cancel", zIsChecked);
        SelectPollViewModel selectPollViewModel = this.LLILLL;
        if (selectPollViewModel == null || (nextLiveDataVQ2 = selectPollViewModel.vQ2()) == null) {
            return;
        }
        nextLiveDataVQ2.setValue(new Throwable("user dismiss"));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ImageModel imageModel;
        String string;
        String str;
        String str2;
        super.onViewCreated(view, bundle);
        C1324720kZq c1324720kZq = (C1324720kZq) view.findViewById(R.id.rgh);
        Gift gift = this.LL;
        String string2 = null;
        if (gift != null) {
            imageModel = gift.image;
        } else {
            imageModel = null;
        }
        C1324570kZb.LIZIZ(imageModel, c1324720kZq);
        C20744116Fj c20744116Fj = (C20744116Fj) view.findViewById(R.id.v9y);
        this.LLILZ = c20744116Fj;
        if (c20744116Fj != null) {
            C786410Ut5.z7(c20744116Fj, new CompoundButton.OnCheckedChangeListener() { // from class: X.0eOL
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    InterfaceC1094160eZy.D0.LJFF(Boolean.valueOf(!z));
                }
            });
        }
        TextView textView = (TextView) view.findViewById(R.id.rfl);
        Context context = getContext();
        String str3 = "";
        if (context != null) {
            Object[] objArr = new Object[1];
            Gift gift2 = this.LL;
            if (gift2 == null || (str2 = gift2.name) == null) {
                str2 = "";
            }
            objArr[0] = str2;
            string = context.getString(2131841941, objArr);
        } else {
            string = null;
        }
        textView.setText(string);
        TextView textView2 = (TextView) view.findViewById(R.id.rgg);
        Context context2 = getContext();
        if (context2 != null) {
            Object[] objArr2 = new Object[1];
            Gift gift3 = this.LL;
            if (gift3 != null && (str = gift3.name) != null) {
                str3 = str;
            }
            objArr2[0] = str3;
            string2 = context2.getString(2131841938, objArr2);
        }
        textView2.setText(string2);
        ((TextView) view.findViewById(R.id.pcb)).setText(2131841939);
        ((TextView) view.findViewById(R.id.upt)).setText(2131841940);
        C786410Ut5.T7((TextView) view.findViewById(R.id.upt), new ACListenerS152S0100000_17(this, 105));
    }
}
