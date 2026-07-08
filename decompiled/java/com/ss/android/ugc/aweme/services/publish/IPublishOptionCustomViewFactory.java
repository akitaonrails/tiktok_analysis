package com.ss.android.ugc.aweme.services.publish;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public interface IPublishOptionCustomViewFactory {
    View createCustomView(Context context, String str, View view, UrlModel urlModel, int i, boolean z, Function1<? super View, Unit> function1, Function1<? super View, Unit> function12);

    void expandRightPartHitRect(View view, ViewGroup viewGroup);

    public static final class DefaultImpls {
        public static /* synthetic */ void expandRightPartHitRect$default(IPublishOptionCustomViewFactory iPublishOptionCustomViewFactory, View view, ViewGroup viewGroup, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    viewGroup = null;
                }
                iPublishOptionCustomViewFactory.expandRightPartHitRect(view, viewGroup);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: expandRightPartHitRect");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ View createCustomView$default(IPublishOptionCustomViewFactory iPublishOptionCustomViewFactory, Context context, String str, View view, UrlModel urlModel, int i, boolean z, Function1 function1, Function1 function12, int i2, Object obj) {
            Function1 function13 = function1;
            boolean z2 = z;
            int i3 = i;
            UrlModel urlModel2 = urlModel;
            View view2 = view;
            if (obj == null) {
                Function1 function14 = null;
                if ((i2 & 4) != 0) {
                    view2 = null;
                }
                if ((i2 & 8) != 0) {
                    urlModel2 = null;
                }
                if ((i2 & 16) != 0) {
                    i3 = 0;
                }
                if ((i2 & 32) != 0) {
                    z2 = false;
                }
                if ((i2 & 64) != 0) {
                    function13 = null;
                }
                if ((i2 & 128) == 0) {
                    function14 = function12;
                }
                return iPublishOptionCustomViewFactory.createCustomView(context, str, view2, urlModel2, i3, z2, function13, function14);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createCustomView");
        }
    }
}
