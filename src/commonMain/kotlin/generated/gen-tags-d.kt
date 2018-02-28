package kotlinx.html

import kotlinx.html.*
import kotlinx.html.impl.*
import kotlinx.html.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

@Suppress("unused")
open class DATALIST(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("datalist", consumer, initialAttributes, null, true, false), HtmlBlockInlineTag {

}
/**
 * Selectable choice
 */
@HtmlTagMarker
inline fun DATALIST.option(classes : String? = null, block : OPTION.() -> Unit = {}) : Unit = OPTION(attributesMapOf("class", classes), consumer).visit(block)
/**
 * Selectable choice
 */
@HtmlTagMarker
fun DATALIST.option(classes : String? = null, content : String = "") : Unit = OPTION(attributesMapOf("class", classes), consumer).visit({+content})

val DATALIST.asFlowContent : FlowContent
    get()  = this

val DATALIST.asPhrasingContent : PhrasingContent
    get()  = this


@Suppress("unused")
open class DD(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dd", consumer, initialAttributes, null, false, false), HtmlBlockTag {

}

@Suppress("unused")
open class DEL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("del", consumer, initialAttributes, null, false, false), HtmlBlockInlineTag {
    var cite : String
        get()  = attributeStringString.get(this, "cite")
        set(newValue) {attributeStringString.set(this, "cite", newValue)}

    var dateTime : String
        get()  = attributeStringString.get(this, "datetime")
        set(newValue) {attributeStringString.set(this, "datetime", newValue)}


}
val DEL.asFlowContent : FlowContent
    get()  = this

val DEL.asPhrasingContent : PhrasingContent
    get()  = this


@Suppress("unused")
open class DETAILS(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("details", consumer, initialAttributes, null, false, false), CommonAttributeGroupFacadeFlowInteractiveContent {
    var open : Boolean
        get()  = attributeBooleanTicker.get(this, "open")
        set(newValue) {attributeBooleanTicker.set(this, "open", newValue)}


}
/**
 * Fieldset legend
 */
@HtmlTagMarker
inline fun DETAILS.legend(classes : String? = null, block : LEGEND.() -> Unit = {}) : Unit = LEGEND(attributesMapOf("class", classes), consumer).visit(block)

val DETAILS.asFlowContent : FlowContent
    get()  = this

val DETAILS.asInteractiveContent : InteractiveContent
    get()  = this


@Suppress("unused")
open class DFN(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dfn", consumer, initialAttributes, null, true, false), HtmlBlockInlineTag {

}
val DFN.asFlowContent : FlowContent
    get()  = this

val DFN.asPhrasingContent : PhrasingContent
    get()  = this


@Suppress("unused")
open class DIALOG(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dialog", consumer, initialAttributes, null, false, false), HtmlBlockTag {

}

@Suppress("unused")
open class DIV(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("div", consumer, initialAttributes, null, false, false), HtmlBlockTag {

}

@Suppress("unused")
open class DL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dl", consumer, initialAttributes, null, false, false), HtmlBlockTag {

}
/**
 * Definition description
 */
@HtmlTagMarker
inline fun DL.dd(classes : String? = null, block : DD.() -> Unit = {}) : Unit = DD(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Definition term
 */
@HtmlTagMarker
inline fun DL.dt(classes : String? = null, block : DT.() -> Unit = {}) : Unit = DT(attributesMapOf("class", classes), consumer).visit(block)


@Suppress("unused")
open class DT(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("dt", consumer, initialAttributes, null, false, false), HtmlInlineTag {

}

