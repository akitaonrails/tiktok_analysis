package com.ss.android.ugc.aweme.services.optimization;

import X.C1AF0;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes10.dex */
public final class PreloadContextReplaceHelper {
    public static final PreloadContextReplaceHelper INSTANCE = new PreloadContextReplaceHelper();

    private final MutableContextWrapper findFirstMutableContextWrapper(View view) {
        MutableContextWrapper mutableContextWrapper;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(view);
        while (!arrayDeque.isEmpty()) {
            View view2 = (View) arrayDeque.removeLast();
            Context context = view2.getContext();
            if ((context instanceof MutableContextWrapper) && (mutableContextWrapper = (MutableContextWrapper) context) != null) {
                return mutableContextWrapper;
            }
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                    arrayDeque.addLast(viewGroup.getChildAt(childCount));
                }
            }
        }
        return null;
    }

    public static final void replaceMutableContextWrapperInTree(View view, Context context) {
        MutableContextWrapper mutableContextWrapperFindFirstMutableContextWrapper = INSTANCE.findFirstMutableContextWrapper(view);
        if (mutableContextWrapperFindFirstMutableContextWrapper == null || mutableContextWrapperFindFirstMutableContextWrapper == context) {
            return;
        }
        mutableContextWrapperFindFirstMutableContextWrapper.setBaseContext(context);
    }

    public static final void replaceAfterInflate(View view, Context context, boolean z, ViewGroup viewGroup) {
        if (z && viewGroup != null) {
            try {
                if ((view instanceof ViewGroup) && ((ViewGroup) view).getChildCount() > 0) {
                    view = ((ViewGroup) view).getChildAt(((ViewGroup) view).getChildCount() - 1);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
                return;
            }
        }
        replaceMutableContextWrapperInTree(view, context);
    }
}
