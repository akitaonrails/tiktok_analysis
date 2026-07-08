package com.ss.android.ugc.aweme.inbox.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes13.dex */
public final class FitsSystemWindowsLinearLayout extends LinearLayout {
    public FitsSystemWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: X.0T8J
            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewRemoved(View view, View view2) {
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewAdded(View view, View view2) {
                if (view2 != null) {
                    view2.requestApplyInsets();
                }
            }
        });
    }
}
