/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.wisegps.wistorm;

public final class R {
    public static final class anim {
        public static int slide_in_from_bottom=0x7f040000;
        public static int slide_in_from_top=0x7f040001;
        public static int slide_out_to_bottom=0x7f040002;
        public static int slide_out_to_top=0x7f040003;
        public static int ws_menu_bottom_in=0x7f040004;
        public static int ws_menu_bottom_out=0x7f040005;
        public static int ws_progressbar_loading=0x7f040006;
    }
    public static final class array {
        public static int English=0x7f080000;
    }
    public static final class attr {
        /**  BELOW HERE ARE DEPRECEATED. DO NOT USE. 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         */
        public static int ptrAdapterViewBackground=0x7f010010;
        /**  Style of Animation should be used displayed when pulling. 
         <p>Must be one or more (separated by '|') of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>rotate</code></td><td>0x0</td><td></td></tr>
<tr><td><code>flip</code></td><td>0x1</td><td></td></tr>
</table>
         */
        public static int ptrAnimationStyle=0x7f01000c;
        /**  Drawable to use as Loading Indicator. Changes both Header and Footer. 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int ptrDrawable=0x7f010006;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int ptrDrawableBottom=0x7f010012;
        /**  Drawable to use as Loading Indicator in the Footer View. Overrides value set in ptrDrawable. 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int ptrDrawableEnd=0x7f010008;
        /**  Drawable to use as Loading Indicator in the Header View. Overrides value set in ptrDrawable. 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int ptrDrawableStart=0x7f010007;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int ptrDrawableTop=0x7f010011;
        /**  A drawable to use as the background of the Header and Footer Loading Views 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         */
        public static int ptrHeaderBackground=0x7f010001;
        /**  Text Color of the Header and Footer Loading Views Sub Header 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         */
        public static int ptrHeaderSubTextColor=0x7f010003;
        /**  Base text color, typeface, size, and style for Header and Footer Loading Views 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int ptrHeaderTextAppearance=0x7f01000a;
        /**  Text Color of the Header and Footer Loading Views 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         */
        public static int ptrHeaderTextColor=0x7f010002;
        /** 
        	Whether PullToRefreshListView has it's extras enabled. This allows the user to be 
        	able to scroll while refreshing, and behaves better. It acheives this by adding
        	Header and/or Footer Views to the ListView.
        
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
         */
        public static int ptrListViewExtrasEnabled=0x7f01000e;
        /**  Mode of Pull-to-Refresh that should be used 
         <p>Must be one or more (separated by '|') of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>disabled</code></td><td>0x0</td><td></td></tr>
<tr><td><code>pullFromStart</code></td><td>0x1</td><td></td></tr>
<tr><td><code>pullFromEnd</code></td><td>0x2</td><td></td></tr>
<tr><td><code>both</code></td><td>0x3</td><td></td></tr>
<tr><td><code>manualOnly</code></td><td>0x4</td><td></td></tr>
<tr><td><code>pullDownFromTop</code></td><td>0x1</td><td> These last two are depreacted </td></tr>
<tr><td><code>pullUpFromBottom</code></td><td>0x2</td><td></td></tr>
</table>
         */
        public static int ptrMode=0x7f010004;
        /**  Whether Android's built-in Over Scroll should be utilised for Pull-to-Refresh. 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
         */
        public static int ptrOverScroll=0x7f010009;
        /**  A drawable to use as the background of the Refreshable View 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         */
        public static int ptrRefreshableViewBackground=0x7f010000;
        /** 
        	Whether the Drawable should be continually rotated as you pull. This only
        	takes effect when using the 'Rotate' Animation Style.
        
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
         */
        public static int ptrRotateDrawableWhilePulling=0x7f01000f;
        /**  Whether the user can scroll while the View is Refreshing 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
         */
        public static int ptrScrollingWhileRefreshingEnabled=0x7f01000d;
        /**  Whether the Indicator overlay(s) should be used 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
         */
        public static int ptrShowIndicator=0x7f010005;
        /**  Base text color, typeface, size, and style for Header and Footer Loading Views Sub Header 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int ptrSubHeaderTextAppearance=0x7f01000b;
    }
    public static final class color {
        public static int black=0x7f090007;
        /**  淡蓝色字体 
         */
        public static int blue_light=0x7f090000;
        /**  蓝色 
         */
        public static int blue_press=0x7f090001;
        public static int gray_light=0x7f090004;
        /**  深蓝色字体 
         */
        public static int navy=0x7f090002;
        /**  浅蓝色字体 
         */
        public static int navy_blue=0x7f090005;
        /**  灰色字体颜色 
         */
        public static int navy_gray=0x7f090003;
        public static int white=0x7f090006;
    }
    public static final class dimen {
        /**  Default screen margins, per the Android Design guidelines. 

         Example customization of dimensions originally defined in res/values/dimens.xml
         (such as screen margins) for screens with more than 820dp of available width. This
         would include 7" and 10" devices in landscape (~960dp and ~1280dp respectively).
    
         */
        public static int activity_horizontal_margin=0x7f050005;
        public static int activity_vertical_margin=0x7f050006;
        public static int header_footer_left_right_padding=0x7f050003;
        public static int header_footer_top_bottom_padding=0x7f050004;
        public static int indicator_corner_radius=0x7f050001;
        public static int indicator_internal_padding=0x7f050002;
        public static int indicator_right_padding=0x7f050000;
    }
    public static final class drawable {
        public static int default_ptr_flip=0x7f020000;
        public static int default_ptr_rotate=0x7f020001;
        public static int ic_launcher=0x7f020002;
        public static int indicator_arrow=0x7f020003;
        public static int indicator_bg_bottom=0x7f020004;
        public static int indicator_bg_top=0x7f020005;
        public static int wise_bg_border_rect=0x7f020006;
        public static int wise_bg_rect_list_search=0x7f020007;
        public static int wise_common_icon_back_btn_normal=0x7f020008;
        public static int wise_common_icon_searchbox_magnifier_2=0x7f020009;
        public static int wise_search_bar_selector=0x7f02000a;
        public static int wise_search_clear_normal=0x7f02000b;
        public static int wise_search_clear_pressed=0x7f02000c;
        public static int ws_account_icon=0x7f02000d;
        public static int ws_bg_border_rect=0x7f02000e;
        public static int ws_bg_rect_list_search=0x7f02000f;
        public static int ws_btn_bg=0x7f020010;
        public static int ws_btn_check=0x7f020011;
        public static int ws_btn_unckeck=0x7f020012;
        public static int ws_checkbox_checked=0x7f020013;
        public static int ws_checkbox_unchecked=0x7f020014;
        public static int ws_clearedittext_selector=0x7f020015;
        public static int ws_common_icon_back_btn_normal=0x7f020016;
        public static int ws_common_icon_searchbox_magnifier_2=0x7f020017;
        public static int ws_icon_search_up_retrieval=0x7f020018;
        public static int ws_icon_user=0x7f020019;
        public static int ws_loading_bg=0x7f02001a;
        public static int ws_login_bg=0x7f02001b;
        public static int ws_logo=0x7f02001c;
        public static int ws_progressbar_loading_01=0x7f02001d;
        public static int ws_progressbar_loading_02=0x7f02001e;
        public static int ws_progressbar_loading_03=0x7f02001f;
        public static int ws_progressbar_loading_04=0x7f020020;
        public static int ws_progressbar_loading_05=0x7f020021;
        public static int ws_progressbar_loading_06=0x7f020022;
        public static int ws_progressbar_loading_07=0x7f020023;
        public static int ws_round_bg=0x7f020024;
        public static int ws_search_bar_selector=0x7f020025;
        public static int ws_search_clear_normal=0x7f020026;
        public static int ws_search_clear_pressed=0x7f020027;
        public static int ws_selector_checkbox=0x7f020028;
    }
    public static final class id {
        public static int action_settings=0x7f06002a;
        public static int both=0x7f060003;
        public static int btn_cancel=0x7f06001b;
        public static int btn_dialog_cancel=0x7f060016;
        public static int btn_dialog_ok=0x7f060017;
        public static int btn_exit=0x7f06001a;
        public static int btn_login=0x7f060024;
        public static int btn_save=0x7f060019;
        public static int dialog_message=0x7f060015;
        public static int dialog_title=0x7f060014;
        public static int disabled=0x7f060004;
        public static int et_account=0x7f060022;
        public static int et_password=0x7f060023;
        public static int et_search=0x7f060012;
        public static int fl_inner=0x7f06000c;
        public static int flip=0x7f06000a;
        public static int gridview=0x7f060000;
        public static int iv_back=0x7f060011;
        public static int iv_loading=0x7f060028;
        public static int iv_serach_bar_icon=0x7f06001c;
        public static int iv_serach_bar_up=0x7f06001e;
        public static int lv_search=0x7f060013;
        public static int manualOnly=0x7f060005;
        public static int notePswd=0x7f060025;
        public static int pop_layout=0x7f060018;
        public static int pullDownFromTop=0x7f060006;
        public static int pullFromEnd=0x7f060007;
        public static int pullFromStart=0x7f060008;
        public static int pullUpFromBottom=0x7f060009;
        public static int pull_to_refresh_image=0x7f06000d;
        public static int pull_to_refresh_progress=0x7f06000e;
        public static int pull_to_refresh_sub_text=0x7f060010;
        public static int pull_to_refresh_text=0x7f06000f;
        public static int rotate=0x7f06000b;
        public static int scrollview=0x7f060002;
        public static int tv_loading_msg=0x7f060029;
        public static int tv_search_bar_info=0x7f06001d;
        public static int tv_update=0x7f060026;
        public static int tv_version=0x7f060027;
        public static int v_line=0x7f06001f;
        public static int webview=0x7f060001;
        public static int ws_iv_logo=0x7f060021;
        public static int ws_llyt_login=0x7f060020;
    }
    public static final class layout {
        public static int pull_to_refresh_header_horizontal=0x7f030000;
        public static int pull_to_refresh_header_vertical=0x7f030001;
        public static int ws_activity_search_bar=0x7f030002;
        public static int ws_alert_dialog=0x7f030003;
        public static int ws_buttom_popupwindow=0x7f030004;
        public static int ws_itemlistw_search_bar=0x7f030005;
        public static int ws_login=0x7f030006;
        public static int ws_progressbar_loading=0x7f030007;
    }
    public static final class menu {
        public static int main=0x7f0b0000;
    }
    public static final class string {
        public static int action_settings=0x7f070008;
        public static int app_name=0x7f070006;
        public static int clear_history=0x7f070015;
        public static int hello_world=0x7f070007;
        /**  Just use standard Pull Down String when pulling up. These can be set for languages which require it 
 Just use standard Pull Down String when pulling up. These can be set for languages which require it 
         */
        public static int pull_to_refresh_from_bottom_pull_label=0x7f070003;
        public static int pull_to_refresh_from_bottom_refreshing_label=0x7f070005;
        public static int pull_to_refresh_from_bottom_release_label=0x7f070004;
        public static int pull_to_refresh_pull_label=0x7f070000;
        public static int pull_to_refresh_refreshing_label=0x7f070002;
        public static int pull_to_refresh_release_label=0x7f070001;
        public static int search_nothing=0x7f070016;
        public static int set_Date=0x7f070014;
        public static int set_time=0x7f070013;
        public static int ws_account_hit=0x7f07000b;
        public static int ws_accout_bind_phone=0x7f070012;
        public static int ws_check_pwd=0x7f07000e;
        public static int ws_login=0x7f07000d;
        public static int ws_login_id_wrong=0x7f070010;
        public static int ws_login_null=0x7f070011;
        public static int ws_login_pd_context=0x7f07000f;
        /**  登录 
         */
        public static int ws_net_timeout=0x7f070009;
        public static int ws_password_hit=0x7f07000c;
        public static int ws_tv_check_update=0x7f07000a;
    }
    public static final class style {
        /** 
        Base application theme, dependent on API level. This theme is replaced
        by AppBaseTheme from res/values-vXX/styles.xml on newer devices.
    

            Theme customizations available in newer API levels can go in
            res/values-vXX/styles.xml, while customizations related to
            backward-compatibility can go here.
        

        Base application theme for API 11+. This theme completely replaces
        AppBaseTheme from res/values/styles.xml on API 11+ devices.
    
 API 11 theme customizations can go here. 

        Base application theme for API 14+. This theme completely replaces
        AppBaseTheme from BOTH res/values/styles.xml and
        res/values-v11/styles.xml on API 14+ devices.
    
 API 14 theme customizations can go here. 
         */
        public static int AppBaseTheme=0x7f0a0000;
        /**  Application theme. 
 All customizations that are NOT specific to a particular API-level can go here. 
         */
        public static int AppTheme=0x7f0a0001;
        /**   加载动画 style
  背景缓存颜色  
         */
        public static int progressDialog=0x7f0a0002;
        /**   WBottomPopupWindow  anim  
         */
        public static int ws_anim_menu_bottom_bar=0x7f0a0003;
    }
    public static final class styleable {
        /** Attributes that can be used with a PullToRefresh.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #PullToRefresh_ptrAdapterViewBackground com.wisegps.wistorm:ptrAdapterViewBackground}</code></td><td> BELOW HERE ARE DEPRECEATED.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrAnimationStyle com.wisegps.wistorm:ptrAnimationStyle}</code></td><td> Style of Animation should be used displayed when pulling.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrDrawable com.wisegps.wistorm:ptrDrawable}</code></td><td> Drawable to use as Loading Indicator.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrDrawableBottom com.wisegps.wistorm:ptrDrawableBottom}</code></td><td></td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrDrawableEnd com.wisegps.wistorm:ptrDrawableEnd}</code></td><td> Drawable to use as Loading Indicator in the Footer View.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrDrawableStart com.wisegps.wistorm:ptrDrawableStart}</code></td><td> Drawable to use as Loading Indicator in the Header View.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrDrawableTop com.wisegps.wistorm:ptrDrawableTop}</code></td><td></td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrHeaderBackground com.wisegps.wistorm:ptrHeaderBackground}</code></td><td> A drawable to use as the background of the Header and Footer Loading Views </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrHeaderSubTextColor com.wisegps.wistorm:ptrHeaderSubTextColor}</code></td><td> Text Color of the Header and Footer Loading Views Sub Header </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrHeaderTextAppearance com.wisegps.wistorm:ptrHeaderTextAppearance}</code></td><td> Base text color, typeface, size, and style for Header and Footer Loading Views </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrHeaderTextColor com.wisegps.wistorm:ptrHeaderTextColor}</code></td><td> Text Color of the Header and Footer Loading Views </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrListViewExtrasEnabled com.wisegps.wistorm:ptrListViewExtrasEnabled}</code></td><td>
        	Whether PullToRefreshListView has it's extras enabled.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrMode com.wisegps.wistorm:ptrMode}</code></td><td> Mode of Pull-to-Refresh that should be used </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrOverScroll com.wisegps.wistorm:ptrOverScroll}</code></td><td> Whether Android's built-in Over Scroll should be utilised for Pull-to-Refresh.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrRefreshableViewBackground com.wisegps.wistorm:ptrRefreshableViewBackground}</code></td><td> A drawable to use as the background of the Refreshable View </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrRotateDrawableWhilePulling com.wisegps.wistorm:ptrRotateDrawableWhilePulling}</code></td><td>
        	Whether the Drawable should be continually rotated as you pull.</td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrScrollingWhileRefreshingEnabled com.wisegps.wistorm:ptrScrollingWhileRefreshingEnabled}</code></td><td> Whether the user can scroll while the View is Refreshing </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrShowIndicator com.wisegps.wistorm:ptrShowIndicator}</code></td><td> Whether the Indicator overlay(s) should be used </td></tr>
           <tr><td><code>{@link #PullToRefresh_ptrSubHeaderTextAppearance com.wisegps.wistorm:ptrSubHeaderTextAppearance}</code></td><td> Base text color, typeface, size, and style for Header and Footer Loading Views Sub Header </td></tr>
           </table>
           @see #PullToRefresh_ptrAdapterViewBackground
           @see #PullToRefresh_ptrAnimationStyle
           @see #PullToRefresh_ptrDrawable
           @see #PullToRefresh_ptrDrawableBottom
           @see #PullToRefresh_ptrDrawableEnd
           @see #PullToRefresh_ptrDrawableStart
           @see #PullToRefresh_ptrDrawableTop
           @see #PullToRefresh_ptrHeaderBackground
           @see #PullToRefresh_ptrHeaderSubTextColor
           @see #PullToRefresh_ptrHeaderTextAppearance
           @see #PullToRefresh_ptrHeaderTextColor
           @see #PullToRefresh_ptrListViewExtrasEnabled
           @see #PullToRefresh_ptrMode
           @see #PullToRefresh_ptrOverScroll
           @see #PullToRefresh_ptrRefreshableViewBackground
           @see #PullToRefresh_ptrRotateDrawableWhilePulling
           @see #PullToRefresh_ptrScrollingWhileRefreshingEnabled
           @see #PullToRefresh_ptrShowIndicator
           @see #PullToRefresh_ptrSubHeaderTextAppearance
         */
        public static final int[] PullToRefresh = {
            0x7f010000, 0x7f010001, 0x7f010002, 0x7f010003,
            0x7f010004, 0x7f010005, 0x7f010006, 0x7f010007,
            0x7f010008, 0x7f010009, 0x7f01000a, 0x7f01000b,
            0x7f01000c, 0x7f01000d, 0x7f01000e, 0x7f01000f,
            0x7f010010, 0x7f010011, 0x7f010012
        };
        /**
          <p>
          @attr description
           BELOW HERE ARE DEPRECEATED. DO NOT USE. 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
          <p>This is a private symbol.
          @attr name com.wisegps.wistorm:ptrAdapterViewBackground
        */
        public static int PullToRefresh_ptrAdapterViewBackground = 16;
        /**
          <p>
          @attr description
           Style of Animation should be used displayed when pulling. 


          <p>Must be one or more (separated by '|') of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>rotate</code></td><td>0x0</td><td></td></tr>
<tr><td><code>flip</code></td><td>0x1</td><td></td></tr>
</table>
          <p>This is a private symbol.
          @attr name com.wisegps.wistorm:ptrAnimationStyle
        */
        public static int PullToRefresh_ptrAnimationStyle = 12;
        /**
          <p>
          @attr description
           Drawable to use as Loading Indicator. Changes both Header and Footer. 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name com.wisegps.wistorm:ptrDrawable
        */
        public static int PullToRefresh_ptrDrawable = 6;
        /**
          <p>This symbol is the offset where the {@link com.wisegps.wistorm.R.attr#ptrDrawableBottom}
          attribute's value can be found in the {@link #PullToRefresh} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name com.wisegps.wistorm:ptrDrawableBottom
        */
        public static int PullToRefresh_ptrDrawableBottom = 18;
        /**
          <p>
          @attr description
           Drawable to use as Loading Indicator in the Footer View. Overrides value set in ptrDrawable. 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name com.wisegps.wistorm:ptrDrawableEnd
        */
        public static int PullToRefresh_ptrDrawableEnd = 8;
        /**
          <p>
          @attr description
           Drawable to use as Loading Indicator in the Header View. Overrides value set in ptrDrawable. 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name com.wisegps.wistorm:ptrDrawableStart
        */
        public static int PullToRefresh_ptrDrawableStart = 7;
        /**
          <p>This symbol is the offset where the {@link com.wisegps.wistorm.R.attr#ptrDrawableTop}
          attribute's value can be found in the {@link #PullToRefresh} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name com.wisegps.wistorm:ptrDrawableTop
        */
        public static int PullToRefresh_ptrDrawableTop = 17;
        /**
          <p>
          @attr description
           A drawable to use as the background of the Header and Footer Loading Views 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
          <p>This is a private symbol.
          @attr name com.wisegps.wistorm:ptrHeaderBackground
        */
        public static int PullToRefresh_ptrHeaderBackground = 1;
        /**
          <p>
          @attr description
           Text Color of the Header and Footer Loading Views Sub Header 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
          <p>This is a private symbol.
          @attr name com.wisegps.wistorm:ptrHeaderSubTextColor
        */
        public static int PullToRefresh_ptrHeaderSubTextColor = 3;
        /**
          <p>
          @attr description
           Base text color, typeface, size, and style for Header and Footer Loading Views 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name com.wisegps.wistorm:ptrHeaderTextAppearance
        */
        public static int PullToRefresh_ptrHeaderTextAppearance = 10;
        /**
          <p>
          @attr description
           Text Color of the Header and Footer Loading Views 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
          <p>This is a private symbol.
          @attr name com.wisegps.wistorm:ptrHeaderTextColor
        */
        public static int PullToRefresh_ptrHeaderTextColor = 2;
        /**
          <p>
          @attr description
          
        	Whether PullToRefreshListView has it's extras enabled. This allows the user to be 
        	able to scroll while refreshing, and behaves better. It acheives this by adding
        	Header and/or Footer Views to the ListView.
        


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
          <p>This is a private symbol.
          @attr name com.wisegps.wistorm:ptrListViewExtrasEnabled
        */
        public static int PullToRefresh_ptrListViewExtrasEnabled = 14;
        /**
          <p>
          @attr description
           Mode of Pull-to-Refresh that should be used 


          <p>Must be one or more (separated by '|') of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>disabled</code></td><td>0x0</td><td></td></tr>
<tr><td><code>pullFromStart</code></td><td>0x1</td><td></td></tr>
<tr><td><code>pullFromEnd</code></td><td>0x2</td><td></td></tr>
<tr><td><code>both</code></td><td>0x3</td><td></td></tr>
<tr><td><code>manualOnly</code></td><td>0x4</td><td></td></tr>
<tr><td><code>pullDownFromTop</code></td><td>0x1</td><td> These last two are depreacted </td></tr>
<tr><td><code>pullUpFromBottom</code></td><td>0x2</td><td></td></tr>
</table>
          <p>This is a private symbol.
          @attr name com.wisegps.wistorm:ptrMode
        */
        public static int PullToRefresh_ptrMode = 4;
        /**
          <p>
          @attr description
           Whether Android's built-in Over Scroll should be utilised for Pull-to-Refresh. 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
          <p>This is a private symbol.
          @attr name com.wisegps.wistorm:ptrOverScroll
        */
        public static int PullToRefresh_ptrOverScroll = 9;
        /**
          <p>
          @attr description
           A drawable to use as the background of the Refreshable View 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
          <p>This is a private symbol.
          @attr name com.wisegps.wistorm:ptrRefreshableViewBackground
        */
        public static int PullToRefresh_ptrRefreshableViewBackground = 0;
        /**
          <p>
          @attr description
          
        	Whether the Drawable should be continually rotated as you pull. This only
        	takes effect when using the 'Rotate' Animation Style.
        


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
          <p>This is a private symbol.
          @attr name com.wisegps.wistorm:ptrRotateDrawableWhilePulling
        */
        public static int PullToRefresh_ptrRotateDrawableWhilePulling = 15;
        /**
          <p>
          @attr description
           Whether the user can scroll while the View is Refreshing 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
          <p>This is a private symbol.
          @attr name com.wisegps.wistorm:ptrScrollingWhileRefreshingEnabled
        */
        public static int PullToRefresh_ptrScrollingWhileRefreshingEnabled = 13;
        /**
          <p>
          @attr description
           Whether the Indicator overlay(s) should be used 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a boolean value, either "<code>true</code>" or "<code>false</code>".
          <p>This is a private symbol.
          @attr name com.wisegps.wistorm:ptrShowIndicator
        */
        public static int PullToRefresh_ptrShowIndicator = 5;
        /**
          <p>
          @attr description
           Base text color, typeface, size, and style for Header and Footer Loading Views Sub Header 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name com.wisegps.wistorm:ptrSubHeaderTextAppearance
        */
        public static int PullToRefresh_ptrSubHeaderTextAppearance = 11;
    };
}
