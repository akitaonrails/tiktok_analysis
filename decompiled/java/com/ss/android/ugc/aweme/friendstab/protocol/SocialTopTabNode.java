package com.ss.android.ugc.aweme.friendstab.protocol;

import X.AbstractC1583720rJa;
import X.InterfaceC1583080rIY;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.TabFragmentNode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SocialTopTabNode extends TabFragmentNode {
    public final Context LLIZLLLIL;
    public final ISocialTabProtocol LLJ;

    @Override // X.InterfaceC1583870rJp
    public final View LJI(InterfaceC1583080rIY interfaceC1583080rIY) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC1583870rJp
    public final void LIZIZ() {
        this.LLJ.LIZIZ();
    }

    @Override // X.InterfaceC1583870rJp
    public final String LIZLLL() {
        return this.LLJ.mc(this.LLIZLLLIL);
    }

    @Override // X.AbstractC1583720rJa, X.InterfaceC1583870rJp
    public final String LJFF() {
        return this.LLJ.getMob();
    }

    @Override // X.AbstractC1583720rJa
    public final Bundle LJIIZILJ() {
        return this.LLJ.V9(this.LLIZLLLIL);
    }

    @Override // X.AbstractC1583720rJa
    public final Class<? extends Fragment> LJIJ() {
        return this.LLJ.LLJIJIL();
    }

    @Override // X.AbstractC1583720rJa
    public final String tag() {
        return this.LLJ.getTag();
    }

    public final int hashCode() {
        return tag().hashCode();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (Intrinsics.LJFF(SocialTopTabNode.class, cls) && TextUtils.equals(tag(), ((AbstractC1583720rJa) obj).tag())) {
            return true;
        }
        return false;
    }

    public SocialTopTabNode(Context context, ISocialTabProtocol iSocialTabProtocol) {
        this.LLIZLLLIL = context;
        this.LLJ = iSocialTabProtocol;
        iSocialTabProtocol.init(context);
    }
}
