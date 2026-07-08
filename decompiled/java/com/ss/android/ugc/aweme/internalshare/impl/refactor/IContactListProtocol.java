package com.ss.android.ugc.aweme.internalshare.impl.refactor;

import X.C06KX;
import X.C1362160lYE;
import X.C1362170lYF;
import X.InterfaceC1361730lXX;
import X.InterfaceC1361740lXY;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;

/* JADX INFO: loaded from: classes22.dex */
public interface IContactListProtocol<T extends InterfaceC1361730lXX> extends C06KX {
    boolean Hl1(IMContact iMContact);

    T ag0(T t, C1362170lYF c1362170lYF);

    boolean enable();

    Class<? extends PowerCell<T>> getWithCell();

    InterfaceC1361740lXY<T> iJ1(C1362160lYE c1362160lYE);

    int priority();

    InterfaceC1361730lXX xS(int i, IMContact iMContact);
}
