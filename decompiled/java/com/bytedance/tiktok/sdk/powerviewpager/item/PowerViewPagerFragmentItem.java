package com.bytedance.tiktok.sdk.powerviewpager.item;

import X.C1852510yJ7;
import X.InterfaceC1891350zJl;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public abstract class PowerViewPagerFragmentItem<F extends Fragment> implements InterfaceC1891350zJl, Parcelable {
    public static final C1852510yJ7 Companion = new Object() { // from class: X.0yJ7
    };

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int getId() {
        return hashCode();
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (getId() == ((PowerViewPagerFragmentItem) interfaceC1891350zJl).getId()) {
            return true;
        }
        return false;
    }
}
