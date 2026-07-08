package com.ss.android.ugc.aweme.chatdetail.redesign.notify;

import X.C0I0B;
import X.C723850SaN;
import X.C786410Ut5;
import X.C913630Zsn;
import X.EnumC877490Ybb;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.df.IGroupNotifyPage;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.AwS116S1100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class GroupNotifyPage implements IGroupNotifyPage {
    @Override // X.InterfaceC1320505Et
    public final void LIZIZ(Fragment fragment) {
        String string;
        String string2;
        Serializable serializable;
        String mobValue;
        EnumC877490Ybb enumC877490Ybb;
        String mobValue2;
        EnumC877490Ybb enumC877490Ybb2;
        Bundle arguments = fragment.getArguments();
        C913630Zsn c913630Zsn = C913630Zsn.LJIIJJI;
        Serializable serializable2 = null;
        if (arguments != null) {
            string = arguments.getString("convId");
        } else {
            string = null;
        }
        String str = "";
        if (string == null) {
            string = "";
        }
        Pair<? extends Object, String>[] pairArr = new Pair[3];
        if (arguments == null || (string2 = arguments.getString("enterFrom")) == null) {
            string2 = "";
        }
        pairArr[0] = new Pair<>("enter_from", string2);
        if (arguments != null) {
            serializable = arguments.getSerializable("fromState");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof EnumC877490Ybb) || (enumC877490Ybb2 = (EnumC877490Ybb) serializable) == null || (mobValue = enumC877490Ybb2.toMobValue()) == null) {
            mobValue = "";
        }
        pairArr[1] = new Pair<>("from_status", mobValue);
        if (arguments != null) {
            serializable2 = arguments.getSerializable("toState");
        }
        if ((serializable2 instanceof EnumC877490Ybb) && (enumC877490Ybb = (EnumC877490Ybb) serializable2) != null && (mobValue2 = enumC877490Ybb.toMobValue()) != null) {
            str = mobValue2;
        }
        pairArr[2] = new Pair<>("to_status", str);
        c913630Zsn.LJJIII("change_group_notify_status", string, pairArr, C0I0B.LJFF.LIZIZ());
    }

    @Override // X.InterfaceC1320505Et
    public final void LIZJ(Fragment fragment) {
        String string;
        Bundle arguments = fragment.getArguments();
        if (arguments != null && (string = arguments.getString("convId")) != null) {
            C723850SaN.LIZ(fragment, false, null, new AwS116S1100000_2(fragment, string, 22), 3);
        }
    }

    @Override // X.InterfaceC1320505Et
    public final View LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C786410Ut5.Td(layoutInflater, R.layout.ci6, viewGroup, false);
    }
}
