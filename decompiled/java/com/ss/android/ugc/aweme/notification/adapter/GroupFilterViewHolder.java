package com.ss.android.ugc.aweme.notification.adapter;

import X.C01GW;
import X.C1324840ka2;
import X.C1602160rnK;
import X.C1903780zdo;
import X.C1904270zeb;
import X.C424610Gkt;
import X.C452501pT;
import X.C786410Ut5;
import X.C800330VaR;
import X.InterfaceC1891350zJl;
import Y.AObserverS230S0100000_28;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupFilterStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeChannelInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class GroupFilterViewHolder extends PowerCell<GroupFilterStruct> implements View.OnClickListener {
    public final C01GW LL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 310));
    public View LLILLJJLI;
    public TuxIconView LLILLL;
    public C424610Gkt LLILZ;
    public TextView LLILZIL;
    public TuxIconView LLILZLL;
    public ImageView LLIZ;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int iIntValue;
        LiveData liveData;
        Integer num;
        GroupFilterStruct groupFilterStruct = (GroupFilterStruct) interfaceC1891350zJl;
        FilterViewModel filterViewModel = (FilterViewModel) this.LL.getValue();
        if (filterViewModel != null && (liveData = (LiveData) filterViewModel.LL.getValue()) != null && (num = (Integer) liveData.getValue()) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = C1904270zeb.LIZJ;
        }
        NoticeChannelInfo noticeChannelInfo = groupFilterStruct.channelInfo;
        if (noticeChannelInfo != null) {
            L5(noticeChannelInfo, iIntValue);
        } else {
            I5(groupFilterStruct, iIntValue);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FilterViewModel filterViewModel;
        GroupFilterStruct item = getItem();
        if (item != null) {
            int i = item.noticeGroup;
            FilterViewModel filterViewModel2 = (FilterViewModel) this.LL.getValue();
            if (filterViewModel2 != null) {
                ((LiveData) filterViewModel2.LL.getValue()).postValue(Integer.valueOf(i));
            }
        }
        GroupFilterStruct item2 = getItem();
        if (item2 != null && (filterViewModel = (FilterViewModel) this.LL.getValue()) != null) {
            ((LiveData) filterViewModel.LLILLJJLI.getValue()).postValue(item2);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        FilterViewModel filterViewModel;
        LiveData liveData;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.aai, viewGroup, false);
        this.LLILLJJLI = viewTd.findViewById(R.id.dxn);
        this.LLILLL = (TuxIconView) viewTd.findViewById(R.id.jw2);
        this.LLILZ = (C424610Gkt) viewTd.findViewById(R.id.lq2);
        this.LLILZIL = (TextView) viewTd.findViewById(R.id.zzq);
        this.LLILZLL = (TuxIconView) viewTd.findViewById(R.id.jw3);
        this.LLIZ = (ImageView) viewTd.findViewById(R.id.lq3);
        View view = this.LLILLJJLI;
        View view2 = null;
        if (view == null) {
            view = null;
        } else {
            view2 = view;
        }
        view2.setForeground(C800330VaR.LIZIZ(view.getContext(), R.drawable.ai3));
        C786410Ut5.I7(this, viewTd);
        LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
        if (currentLifecycleOwner != null && (filterViewModel = (FilterViewModel) this.LL.getValue()) != null && (liveData = (LiveData) filterViewModel.LL.getValue()) != null) {
            liveData.observe(currentLifecycleOwner, new AObserverS230S0100000_28(this, 34));
        }
        return viewTd;
    }

    public final void I5(GroupFilterStruct groupFilterStruct, int i) {
        TuxIconView tuxIconView = this.LLILLL;
        ImageView imageView = null;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        C424610Gkt c424610Gkt = this.LLILZ;
        if (c424610Gkt != null) {
            int visibility = c424610Gkt.getVisibility();
            c424610Gkt.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c424610Gkt);
        }
        TuxIconView tuxIconView2 = this.LLILLL;
        if (tuxIconView2 == null) {
            tuxIconView2 = null;
        }
        tuxIconView2.setIconRes(groupFilterStruct.groupIconId);
        TextView textView = this.LLILZIL;
        if (textView == null) {
            textView = null;
        }
        textView.setText(this.itemView.getContext().getString(groupFilterStruct.titleResId));
        if (groupFilterStruct.noticeGroup == i) {
            TuxIconView tuxIconView3 = this.LLILZLL;
            if (tuxIconView3 == null) {
                tuxIconView3 = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
            ImageView imageView2 = this.LLIZ;
            if (imageView2 != null) {
                imageView = imageView2;
            }
            C786410Ut5.LJZI(8, imageView);
            return;
        }
        TuxIconView tuxIconView4 = this.LLILZLL;
        if (tuxIconView4 == null) {
            tuxIconView4 = null;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
        int i2 = groupFilterStruct.filterType;
        if (i2 != Integer.MIN_VALUE ? C1903780zdo.LJII().LJJ(i2) > 0 : C1903780zdo.LJIIJJI(groupFilterStruct.noticeGroup)) {
            ImageView imageView3 = this.LLIZ;
            if (imageView3 != null) {
                imageView = imageView3;
            }
            C786410Ut5.LJZI(0, imageView);
            return;
        }
        ImageView imageView4 = this.LLIZ;
        if (imageView4 != null) {
            imageView = imageView4;
        }
        C786410Ut5.LJZI(8, imageView);
    }

    public final void L5(NoticeChannelInfo noticeChannelInfo, int i) {
        TuxIconView tuxIconView = this.LLILLL;
        ImageView imageView = null;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, 4);
        C424610Gkt c424610Gkt = this.LLILZ;
        if (c424610Gkt != null) {
            int visibility = c424610Gkt.getVisibility();
            c424610Gkt.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c424610Gkt);
            C1324840ka2.LJFF(c424610Gkt, noticeChannelInfo.logo);
        }
        TextView textView = this.LLILZIL;
        if (textView == null) {
            textView = null;
        }
        textView.setText(noticeChannelInfo.name);
        if (noticeChannelInfo.group == i) {
            TuxIconView tuxIconView2 = this.LLILZLL;
            if (tuxIconView2 == null) {
                tuxIconView2 = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            ImageView imageView2 = this.LLIZ;
            if (imageView2 != null) {
                imageView = imageView2;
            }
            C786410Ut5.LJZI(8, imageView);
            return;
        }
        TuxIconView tuxIconView3 = this.LLILZLL;
        if (tuxIconView3 == null) {
            tuxIconView3 = null;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
        if (!noticeChannelInfo.hasRead) {
            ImageView imageView3 = this.LLIZ;
            if (imageView3 != null) {
                imageView = imageView3;
            }
            C786410Ut5.LJZI(0, imageView);
            return;
        }
        ImageView imageView4 = this.LLIZ;
        if (imageView4 != null) {
            imageView = imageView4;
        }
        C786410Ut5.LJZI(8, imageView);
    }
}
