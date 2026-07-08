package com.bytedance.poplayer;

import X.C688120Qyw;
import X.InterfaceC20661215t4;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes32.dex */
public interface IPopupTask<Popup> {
    View getRootView(Popup popup);

    Popup showPopup(C688120Qyw c688120Qyw);

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static <Popup> View getRootView(IPopupTask<Popup> iPopupTask, Popup popup) {
            Window window;
            if (popup instanceof Dialog) {
                Window window2 = ((Dialog) popup).getWindow();
                if (window2 == null) {
                    return null;
                }
                return window2.getDecorView();
            }
            if (popup instanceof PopupWindow) {
                return ((PopupWindow) popup).getContentView();
            }
            if (popup instanceof DialogFragment) {
                View view = ((Fragment) popup).getView();
                if (view == null) {
                    Dialog dialog = ((DialogFragment) popup).getDialog();
                    if (dialog == null || (window = dialog.getWindow()) == null) {
                        return null;
                    }
                    return window.getDecorView();
                }
                return view;
            }
            if (popup instanceof View) {
                return (View) popup;
            }
            if (popup instanceof InterfaceC20661215t4) {
                return ((InterfaceC20661215t4) popup).getRootView();
            }
            throw new RuntimeException("Your popup must be Dialog, PopupWindow, DialogFragment, View or implementation class of IPopup interface.");
        }
    }
}
