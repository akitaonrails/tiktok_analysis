package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material;

import X.AbstractC214814194y;
import X.C0HZQ;
import X.C0JEQ;
import X.C0LAB;
import X.C0LE3;
import X.C0MGE;
import X.C0ML7;
import X.C0ML9;
import X.C0MMK;
import X.C0MWS;
import X.C1390410mHn;
import X.C13BV;
import X.C20684815ws;
import X.C2217381BqS;
import X.C530830Krp;
import X.C786410Ut5;
import X.EnumC538220L8y;
import X.InterfaceC362610EJn;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseMaterialSelectScene extends AbstractC214814194y implements C0MGE, C0MWS, InterfaceC524950KiL {
    public View LLJJIJIL;
    public View LLJJJ;
    public C0HZQ LLJJJIL;
    public View LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public TuxIconView LLJJJJLIIL;
    public View LLJJL;
    public C1390410mHn LLJJLIIIJLLLLLLLZ;
    public RecyclerView LLJL;
    public C0MMK LLJLIL;
    public ShortVideoContext LLJLILLLLZIIL;
    public int LLJLL;
    public C0JEQ LLJLLIL;
    public List<ForwardMedia> LLJLLL;
    public final List<InterfaceC484050IyZ> LLJZ = new ArrayList();
    public final List<InterfaceC362610EJn> LLJZIJLIL = new ArrayList();

    public abstract List<OnThisDayTiktokMediaModel> LLLLJI();

    public abstract List<OnThisDayTiktokMediaModel> LLLLLIL();

    public abstract void LLLLLL();

    public abstract void LLLLLLJ(ArrayList<OnThisDayTiktokMediaModel> arrayList);

    public abstract void LLLLLLL(ViewGroup viewGroup);

    @Override // X.C0MWS
    public final C0LE3 getType() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel> LLLLL() {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.BaseMaterialSelectScene.LLLLL():java.util.List");
    }

    public void LLLLLILLIL() {
        View view = this.LLJJIJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        TuxIconView tuxIconView = this.LLJJJJLIIL;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        View view2 = this.LLJJL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
    }

    @Override // X.AbstractC214814194y, X.C198H
    public final boolean onBackPressed() {
        LLLLLJIL("click_sys_exit");
        finish();
        return true;
    }

    public List<Object> LLLLLLIL() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
        ListProtector.add(this.LLJZIJLIL, 0, interfaceC362610EJn);
    }

    public final void LLLLLJIL(String str) {
        CreativeModel creativeModel;
        ShortVideoContext shortVideoContext = this.LLJLILLLLZIIL;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            for (OnThisDayTiktokMediaModel onThisDayTiktokMediaModel : LLLLLIL()) {
                if (!onThisDayTiktokMediaModel.isDefaultSelectItem) {
                    i7 = 1;
                }
                if (onThisDayTiktokMediaModel.loadSource == EnumC538220L8y.RECALL_MEDIA) {
                    ForwardMedia forwardMedia = onThisDayTiktokMediaModel.forwardMedia;
                    if (forwardMedia != null && forwardMedia.isStory()) {
                        i2++;
                    } else if (!C530830Krp.LIZIZ(onThisDayTiktokMediaModel)) {
                        i++;
                    }
                } else if (!C530830Krp.LIZIZ(onThisDayTiktokMediaModel)) {
                    i3++;
                }
                if (onThisDayTiktokMediaModel.LJIILJJIL()) {
                    i6++;
                } else {
                    i5++;
                }
                if (C530830Krp.LIZIZ(onThisDayTiktokMediaModel)) {
                    i4++;
                }
            }
            C0ML7 c0ml7 = C0ML7.LIZ;
            List<ForwardMedia> list = this.LLJLLL;
            c0ml7.getClass();
            C0LAB c0lab = new C0LAB();
            C0ML7.LIZ(creativeModel, c0lab);
            C0ML9.LIZ(creativeModel, c0lab);
            C0ML7.LJ(c0lab, list);
            c0lab.LIZ(i + i2 + i3 + i4, "content_cnt");
            c0lab.LIZ(i, "post_cnt");
            c0lab.LIZ(i2, "story_cnt");
            c0lab.LIZ(i3, "local_cnt");
            c0lab.LIZ(i5, "pic_cnt");
            c0lab.LIZ(i6, "video_cnt");
            c0lab.LIZ(i4, "auto_cnt");
            c0lab.LIZ(i7, "is_non_default");
            c0lab.LJ("exit_method", str);
            c0lab.LJ("on_this_day_enter_method", C0ML7.LIZIZ);
            C20684815ws.LJIILLIIL("on_this_day_view_all_exit", c0lab.LIZ);
        }
    }

    public final void LLLLLJLJLL(ChooseMediaViewModel chooseMediaViewModel) {
        BaseJediViewModel.iR2(chooseMediaViewModel, this, new C2217381BqS() { // from class: X.0Kle
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ChooseMediaState) obj).getPreviewNextBtnState();
            }
        }, new AwS587S0100000_8(this, 179));
        BaseJediViewModel.iR2(chooseMediaViewModel, this, new C2217381BqS() { // from class: X.0Ki8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ChooseMediaState) obj).getPreviewNextBtnClickState();
            }
        }, new AwS587S0100000_8(this, 180));
        BaseJediViewModel.iR2(chooseMediaViewModel, this, new C2217381BqS() { // from class: X.0KiA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ChooseMediaState) obj).getDockerHasShown();
            }
        }, new AwS587S0100000_8(chooseMediaViewModel, 181));
        BaseJediViewModel.iR2(chooseMediaViewModel, this, new C2217381BqS() { // from class: X.0Kgi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ChooseMediaState) obj).getPreviewNextBtnMediaState();
            }
        }, new AwS586S0100000_7(this, 267));
    }

    @Override // X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
        ((ArrayList) this.LLJZ).add(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
        ((ArrayList) this.LLJZ).remove(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
        ((ArrayList) this.LLJZIJLIL).remove(interfaceC362610EJn);
    }

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
        ((ArrayList) this.LLJZIJLIL).add(interfaceC362610EJn);
    }

    @Override // X.AbstractC214814194y
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Iterator it2 = ((ArrayList) this.LLJZIJLIL).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC362610EJn) it2.next()).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        if (i == 4 && onBackPressed()) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d0  */
    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.BaseMaterialSelectScene.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.eqr, viewGroup, false);
    }

    @Override // X.AbstractC214814194y
    public final boolean onInterceptActivityResult(int i, int i2, Intent intent) {
        Iterator it2 = ((ArrayList) this.LLJZ).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC484050IyZ) it2.next()).onActivityResult(i, i2, intent)) {
                return true;
            }
        }
        return false;
    }
}
