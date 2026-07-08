package com.ss.android.ugc.aweme.friendstab.ui;

import X.AbstractC20746216Ge;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.appbar.AppBarLayout$Behavior;

/* JADX INFO: loaded from: classes33.dex */
public final class FriendsV3SkylightBarLayout$Behavior extends AppBarLayout$Behavior {
    public FriendsV3SkylightBarLayout$Behavior() {
        setDragCallback(new AbstractC20746216Ge() { // from class: X.18Z3
            @Override // X.C16GK
            public final boolean LIZ(C16GX c16gx) {
                return false;
            }
        });
    }

    public FriendsV3SkylightBarLayout$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setDragCallback(new AbstractC20746216Ge() { // from class: X.18Z3
            @Override // X.C16GK
            public final boolean LIZ(C16GX c16gx) {
                return false;
            }
        });
    }
}
