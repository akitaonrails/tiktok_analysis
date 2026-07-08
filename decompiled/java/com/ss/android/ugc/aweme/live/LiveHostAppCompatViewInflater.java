package com.ss.android.ugc.aweme.live;

import X.C21413018r2;
import X.InterfaceLayoutInflaterFactory2C1091780eW8;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTextViewOptSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: loaded from: classes18.dex */
public class LiveHostAppCompatViewInflater extends C21413018r2 {
    public InterfaceLayoutInflaterFactory2C1091780eW8 viewInflater;

    @Override // X.C21413018r2
    public View createView(Context context, String str, AttributeSet attributeSet) {
        if (this.viewInflater == null) {
            this.viewInflater = new InterfaceLayoutInflaterFactory2C1091780eW8() { // from class: X.0eW3
                @Override // X.InterfaceLayoutInflaterFactory2C1091780eW8
                public final View LJLJJLL(Context context2, String str2, AttributeSet attributeSet2) {
                    if (C1105280eru.LIZJ.containsKey(str2) && C1105280eru.LIZ(context2, ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest())) {
                        return C1105280eru.LIZLLL(str2, context2, attributeSet2, ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest());
                    }
                    return null;
                }

                @Override // android.view.LayoutInflater.Factory
                public final View onCreateView(String str2, Context context2, AttributeSet attributeSet2) {
                    return LJLJJLL(context2, str2, attributeSet2);
                }

                @Override // android.view.LayoutInflater.Factory2
                public final View onCreateView(View view, String str2, Context context2, AttributeSet attributeSet2) {
                    return LJLJJLL(context2, str2, attributeSet2);
                }
            };
        }
        if (this.viewInflater != null && LiveTextViewOptSetting.enable()) {
            return this.viewInflater.LJLJJLL(context, str, attributeSet);
        }
        return super.createView(context, str, attributeSet);
    }
}
