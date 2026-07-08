package kotlin.jvm.internal;

import X.C09AY;
import X.C786410Ut5;
import Y.ARunnableS12S0500000_18;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.mix.model.MixStatisStruct;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.mix.platform.PlaylistBottomBarComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public class AwS92S0500000_18 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS92S0500000_18 awS92S0500000_18, Object obj, Object obj2) {
        String name;
        MixStatisStruct statis;
        String quantityString;
        Float fValueOf;
        TextPaint paint;
        String str;
        Resources resources;
        View view;
        MixStruct mixStruct = (MixStruct) obj2;
        if (mixStruct == null && (view = (View) awS92S0500000_18.l0) != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        String name2 = null;
        if (mixStruct != null && (statis = mixStruct.getStatis()) != null) {
            int total = statis.getTotal();
            PlaylistBottomBarComponent playlistBottomBarComponent = (PlaylistBottomBarComponent) awS92S0500000_18.l2;
            TextView textView = (TextView) awS92S0500000_18.l3;
            View view2 = (View) awS92S0500000_18.l4;
            TextView textView2 = (TextView) awS92S0500000_18.l1;
            Context context = playlistBottomBarComponent.getContext();
            if (context != null && (resources = context.getResources()) != null) {
                quantityString = resources.getQuantityString(2131755471, total, Integer.valueOf(total));
            } else {
                quantityString = null;
            }
            if (textView != null && (paint = textView.getPaint()) != null) {
                if (quantityString == null) {
                    str = "";
                } else {
                    str = quantityString;
                }
                fValueOf = Float.valueOf(paint.measureText(str));
            } else {
                fValueOf = null;
            }
            if (view2 != null) {
                HandlerHook.viewPost(view2, new ARunnableS12S0500000_18(fValueOf, view2, textView2, textView, view2, 0));
            }
            if (textView != null) {
                textView.setText(quantityString);
            }
        }
        TextView textView3 = (TextView) awS92S0500000_18.l1;
        if (textView3 != null) {
            if (mixStruct != null) {
                name2 = mixStruct.getName();
            }
            textView3.setText(name2);
        }
        if (mixStruct != null && (name = mixStruct.getName()) != null && name.length() != 0 && mixStruct != null && mixStruct.getStatis() != null) {
            View view3 = (View) awS92S0500000_18.l0;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(0, view3);
            }
        } else {
            View view4 = (View) awS92S0500000_18.l0;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(8, view4);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS92S0500000_18 awS92S0500000_18, Object obj, Object obj2) {
        String name;
        MixStatisStruct statis;
        String quantityString;
        Float fValueOf;
        TextPaint paint;
        String str;
        Resources resources;
        View view;
        MixStruct mixStruct = (MixStruct) obj2;
        if (mixStruct == null && (view = (View) awS92S0500000_18.l0) != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        String name2 = null;
        if (mixStruct != null && (statis = mixStruct.getStatis()) != null) {
            int total = statis.getTotal();
            PlaylistBottomBarComponent playlistBottomBarComponent = (PlaylistBottomBarComponent) awS92S0500000_18.l2;
            TextView textView = (TextView) awS92S0500000_18.l3;
            View view2 = (View) awS92S0500000_18.l4;
            TextView textView2 = (TextView) awS92S0500000_18.l1;
            Context context = playlistBottomBarComponent.getContext();
            if (context != null && (resources = context.getResources()) != null) {
                quantityString = resources.getQuantityString(2131755471, total, Integer.valueOf(total));
            } else {
                quantityString = null;
            }
            if (textView != null && (paint = textView.getPaint()) != null) {
                if (quantityString == null) {
                    str = "";
                } else {
                    str = quantityString;
                }
                fValueOf = Float.valueOf(paint.measureText(str));
            } else {
                fValueOf = null;
            }
            if (view2 != null) {
                HandlerHook.viewPost(view2, new ARunnableS12S0500000_18(fValueOf, view2, textView2, textView, view2, 1));
            }
            if (textView != null) {
                textView.setText(quantityString);
            }
        }
        TextView textView3 = (TextView) awS92S0500000_18.l1;
        if (textView3 != null) {
            if (mixStruct != null) {
                name2 = mixStruct.getName();
            }
            textView3.setText(name2);
        }
        if (mixStruct != null && (name = mixStruct.getName()) != null && name.length() != 0 && mixStruct != null && mixStruct.getStatis() != null) {
            View view3 = (View) awS92S0500000_18.l0;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(0, view3);
            }
        } else {
            View view4 = (View) awS92S0500000_18.l0;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(8, view4);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS92S0500000_18(View view, TextView textView, PlaylistBottomBarComponent playlistBottomBarComponent, TextView textView2, View view2, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = textView;
        this.l2 = playlistBottomBarComponent;
        this.l3 = textView2;
        this.l4 = view2;
    }
}
