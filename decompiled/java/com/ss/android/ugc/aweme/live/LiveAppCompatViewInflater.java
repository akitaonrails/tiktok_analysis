package com.ss.android.ugc.aweme.live;

import X.C1091720eW2;
import X.C21413018r2;
import X.InterfaceLayoutInflaterFactory2C1091780eW8;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes18.dex */
public class LiveAppCompatViewInflater extends C21413018r2 {
    public InterfaceLayoutInflaterFactory2C1091780eW8 viewInflater;

    @Override // X.C21413018r2
    public View createView(Context context, String str, AttributeSet attributeSet) {
        if (this.viewInflater == null) {
            this.viewInflater = new C1091720eW2();
        }
        InterfaceLayoutInflaterFactory2C1091780eW8 interfaceLayoutInflaterFactory2C1091780eW8 = this.viewInflater;
        if (interfaceLayoutInflaterFactory2C1091780eW8 != null) {
            return interfaceLayoutInflaterFactory2C1091780eW8.LJLJJLL(context, str, attributeSet);
        }
        return super.createView(context, str, attributeSet);
    }
}
