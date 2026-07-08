package com.bytedance.poplayer;

import X.C19EG;
import X.C688120Qyw;
import X.C786410Ut5;
import X.InterfaceC20661215t4;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes32.dex */
public interface IStandardPopupTask<POPUP> {
    void LIZIZ();

    POPUP LJII(C688120Qyw c688120Qyw);

    View getRealShowView(POPUP popup);

    void onPopupDismiss();

    View showRootView(POPUP popup, C688120Qyw c688120Qyw);

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static <POPUP> View getRealShowView(IStandardPopupTask<POPUP> iStandardPopupTask, POPUP popup) {
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

        /* JADX WARN: Multi-variable type inference failed */
        public static <POPUP> View showRootView(IStandardPopupTask<POPUP> iStandardPopupTask, POPUP popup, C688120Qyw c688120Qyw) {
            String string;
            FragmentManager supportFragmentManager;
            Dialog dialog;
            Window window;
            if (popup instanceof Dialog) {
                Dialog dialog2 = (Dialog) popup;
                C786410Ut5.B4(dialog2);
                Window window2 = dialog2.getWindow();
                if (window2 == null) {
                    return null;
                }
                return window2.getDecorView();
            }
            if (popup instanceof DialogFragment) {
                Bundle bundle = c688120Qyw.LIZJ;
                if (bundle == null || (string = bundle.getString("sheet_tag")) == null) {
                    string = "";
                }
                C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
                if (c19egLIZIZ == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null) {
                    return null;
                }
                DialogFragment dialogFragment = (DialogFragment) popup;
                dialogFragment.show(supportFragmentManager, string);
                View view = ((Fragment) popup).getView();
                if (view == null && ((dialog = dialogFragment.getDialog()) == null || (window = dialog.getWindow()) == null || (view = window.getDecorView()) == null)) {
                    return null;
                }
                return view;
            }
            throw new RuntimeException("Your popup must be Dialog, PopupWindow, DialogFragment, View or implementation class of IPopup interface.");
        }
    }
}
